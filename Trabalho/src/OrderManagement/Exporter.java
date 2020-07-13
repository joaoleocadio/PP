package OrderManagement;

import java.io.IOException;
import java.io.FileWriter;
import com.google.gson.Gson;
import order.management.IExporter;
import order.management.IOrder;
import order.management.IShipping;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/*
* Nome: <Samuel Luciano Correia da Cunha>
* Número: <8160526>
* Turma: <T3>
*
* Nome: <João Emanuel Carvalho Leocádio>
* Número: <8160523>
* Turma: <T2>
 */
public class Exporter implements IExporter {

    private String filePath = "export.json";
    private String file = "graficoBarras.json";
    private IOrder[] graficOrders;
    private IOrder order;
    private String GUIpath;
    private String GraphBarPath;
    private String GraphPiePath;
    private String OrderInfoPath;

    public IOrder[] getGraficOrders() {
        return graficOrders;
    }

    public void setGraficOrders(IOrder[] graficOrders) {
        this.graficOrders = graficOrders;
    }

    
    
    public Exporter(IOrder order, String GUIpath) {
        this.order = order;
        this.GUIpath = GUIpath;
    }

    public IOrder getOrder() {
        return order;
    }

    public void setOrder(IOrder order) {
        this.order = order;
    }

    public String getGUIpath() {
        return GUIpath;
    }

    public void setGUIpath(String GUIpath) {
        this.GUIpath = GUIpath;
    }

    public String getGraphBarPath() {
        return GraphBarPath;
    }

    public void setGraphBarPath(String GraphBarPath) {
        this.GraphBarPath = GraphBarPath;
    }

    public String getGraphPiePath() {
        return GraphPiePath;
    }

    public void setGraphPiePath(String GraphPiePath) {
        this.GraphPiePath = GraphPiePath;
    }

    public String getOrderInfoPath() {
        return OrderInfoPath;
    }

    public void setOrderInfoPath(String OrderInfoPath) {
        this.OrderInfoPath = OrderInfoPath;
    }
       
    
    
    @Override
    public void export() throws IOException {
        try (FileWriter file = new FileWriter(this.GraphBarPath)){
            file.write(serializeBarGraph().toJSONString());
        }
    }
    
    /**
     * Metodo que ira fazer export da order para json
     * 
     * @param order order a ser exportada
     * @throws IOException 
     */
    public void export(IOrder order) throws IOException {
        try {
            Gson gson = new Gson();
            FileWriter fileWriter = new FileWriter(filePath);
            gson.toJson(order, fileWriter);
            fileWriter.close();
            System.out.println("Formato JSON escrito com sucesso para o ficheiro: " + filePath);
        }
        
        catch (IOException e) {
            System.out.println(e.toString());
        }

    }
    
    private JSONObject serializeBarGraph() throws IOException {
        JSONObject obj = new JSONObject();
        JSONObject data = new JSONObject();
        JSONArray dataSets = new JSONArray();
        JSONArray labels = new JSONArray();
        JSONObject cost = new JSONObject();
        JSONArray costArray = new JSONArray();
        JSONObject numshippings = new JSONObject();
        JSONArray numshippingsArray = new JSONArray();
        JSONObject numContainers = new JSONObject();
        JSONArray numContainersArray = new JSONArray();
        int tmp = 0;
        
        for (IOrder ord : this.graficOrders){
            costArray.add(ord.getCost());
            numshippingsArray.add(ord.getShippings().length);
            for (IShipping ship : ord.getShippings()){
                tmp += ship.getContainers().length;
            }
            numContainersArray.add(tmp);
        }
        
        cost.put("data", costArray);
        cost.put("label", "Order cost");
        
        numshippings.put("data", numshippingsArray);
        numshippings.put("label", "Number of shipments");
        
        numContainers.put("data", numContainersArray);
        numContainers.put("label", "Number of containers");
        
        dataSets.add(cost);
        dataSets.add(numContainers);
        dataSets.add(numshippings);
        
        for (int i = 0; i < this.graficOrders.length; i++){
            labels.add("Order" + (i + 1));
        }
        
        data.put("datasets", dataSets);
        data.put("labels", labels);
        
        obj.put("type", "pie");
        obj.put("data", data);
        obj.put("type", "bar");
        obj.put("title", "order costs and number of shipments and containers");
        
        return obj;
    }
}