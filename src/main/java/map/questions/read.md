**Conversion Of HashMap Values Into ArrayList :**

For this, we use values() method of HashMap which returns the Collection 
containing all values of the HashMap. Then we use this Collection to create the
ArrayList of values.

//Creating a HashMap object
HashMap<String, String> map = new HashMap<String, String>();
//Getting Collection of values from HashMap
Collection<String> values = map.values();
//Creating an ArrayList of values
ArrayList<String> listOfValues = new ArrayList<String>(values);


**Conversion Of HashMap’s Key-Value Pairs Into ArrayList :**
//Creating a HashMap object
HashMap<String, String> map = new HashMap<String, String>();
//Getting Set of entries from HashMap
Set<Entry<String, String>> entrySet = map.entrySet();
//Creating an ArrayList of Entry objects
ArrayList<Entry<String, String>> listOfEntry = new ArrayList<Entry<String, String>>(entrySet);

