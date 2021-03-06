# Recursos PP - Trabalho Prático de Época de Recurso

## Javadoc

Documentação que devem seguir para a implementação da API. A utilização destes recursos é obrigatória!

## Exemplo documento JSON (ficheiroJSONExemplo)
Exemplo de documento JSON que a API deverá gerar para posteiror importação pela interface gráfica.

```json
{
  "date": {
    "month": 1,
    "year": 2020,
    "day": 1
  },
  "shippings": [
    {
      "shipping": {
        "cost": 62.5,
        "containers": [
          {
            "volume": 125,
            "reference": "c1",
            "depth": 5,
            "color": "black",
            "length": 5,
            "closed": true,
            "colorEdge": "blue",
            "items": [
              {
                "reference": "ITEM5",
                "depth": 5,
                "color": "blue",
                "x": 0,
                "length": 5,
                "y": 0,
                "description": "desc 5",
                "z": 0,
                "colorEdge": "blue",
                "height": 5
              }
            ],
            "height": 5,
            "occupiedVolume": 125
          },
          {
            "volume": 125,
            "reference": "c2",
            "depth": 5,
            "color": "black",
            "length": 5,
            "closed": true,
            "colorEdge": "blue",
            "items": [
              {
                "reference": "ITEM4",
                "depth": 4,
                "color": "blue",
                "x": 0,
                "length": 4,
                "y": 0,
                "description": "desc 4",
                "z": 0,
                "colorEdge": "blue",
                "height": 3
              },
              {
                "reference": "ITEM2",
                "depth": 2,
                "color": "blue",
                "x": 0,
                "length": 2,
                "y": 3,
                "description": "desc 2",
                "z": 0,
                "colorEdge": "blue",
                "height": 1
              },
              {
                "reference": "ITEM1",
                "depth": 1,
                "color": "blue",
                "x": 4,
                "length": 1,
                "y": 0,
                "description": "desc 1",
                "z": 0,
                "colorEdge": "blue",
                "height": 2
              }
            ],
            "height": 5,
            "occupiedVolume": 54
          }
        ],
        "status": "RECEIVED"
      }
    },
    {
      "shipping": {
        "cost": 31.25,
        "containers": [
          {
            "volume": 125,
            "reference": "c3",
            "depth": 5,
            "color": "black",
            "length": 5,
            "closed": true,
            "colorEdge": "blue",
            "items": [
              {
                "reference": "ITEM3",
                "depth": 3,
                "color": "blue",
                "x": 0,
                "length": 3,
                "y": 0,
                "description": "desc 3",
                "z": 0,
                "colorEdge": "blue",
                "height": 4
              }
            ],
            "height": 5,
            "occupiedVolume": 36
          }
        ],
        "status": "CLOSED"
      }
    }
  ],
  "destination": {
    "address": {
      "country": "country A2",
      "number": 2,
      "city": "city A2",
      "street": "street A2",
      "state": "state A2"
    },
    "name": "Jane Doe"
  },
  "id": 2,
  "customer": {
    "address": {
      "country": "country A1",
      "number": 1,
      "city": "city A1",
      "street": "street A1",
      "state": "state A1"
    },
    "name": "John Doe",
    "id": 2,
    "billingAddress": {
      "country": "country A1",
      "number": 1,
      "city": "city A1",
      "street": "street A1",
      "state": "state A1"
    }
  }
}
```


## Ficheiro jar (PP_ER_Resources.jar)
Ficheiro Jar que devem importar num novo projeto. Para além da biblioteca que contém os recursos que devem utilizar no trabalho, é ainda incluída a biblioteca: json-simple-1.1.1, que pode ser utilizada para a manipulação de documentos JSON.

Para importar a biblioteca (PP_EN_Resources.jar) no seu projeto, deverá selecionar com botão direito do rato a pasta Libraries e selecionar add JAR/Folder. Ver:
[imagem](http://wiki.netbeans.org/wiki/images/b/b7/Adding_jar_AntlrInNetBeansJavaApplication.jpg)

