# arbitrary-join

Minimal not working example for [this stackoverflow question](https://stackoverflow.com/questions/62447466/how-to-populate-a-collection-based-on-existing-columns-with-hibernate).

### Scenario
Before
1. ```http
   POST /foo
   
   {"someField" : 5}
   ```
1. ```http
   POST /bar
   
   {"someField" : 5}
   ```
When
1. ```http
   GET /foo
   ```

Then
1. ```json
   [{
     "someField" : 5,
     "bars" : [{
       "someField" : 5
     }]
   }]
   ```
   
