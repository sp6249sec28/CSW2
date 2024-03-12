// package Assignment_3;

public class Pair<K,V> {
    private K key;
    private V value;
    public Pair(K key, V value) { 
        this.key = key;  
        this.value = value;  
    } 
    public K getKey() { 
        return key; 
    }
    public V getValue() { 
        return value;  
    }  
    public void setKey(){
        this.key = key;
    }
    public void setValue(){
        this.value = value;
    }
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair(15, "Somnath"); 
        System.out.println("Key: " + pair1.getKey());  
        System.out.println("Value: " + pair1.getValue()); 
    }
}
