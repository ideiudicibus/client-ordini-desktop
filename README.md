# Client Ordini Desktop (with JavaFXWebView)
##### you can usually skip this... 
1. generate the proper sources needed to handle the Regione Lazio Sistema Pagamenti Ordini Web Services use the generateSourcesFromWSDL profile
``$mvn -PgenerateSourcesFromWSDL``
2. modify the .example.properties to feed the tests with username,password and other fixtures (i.e. orderId)
      
       note: modify the url (now 'test environment') when needed
 
###### normal ALM: run the tests
 ``$mvn -Palm clean install``
this command will run compilation and test, basi test is fetch a single order

```javascript
username=
password=
testGetOrdineId.ordineId= 
```

![client screenshot](/src/test/resources/screenshot/client-ordini-desktop.png?raw=true "client ordini desktop")
