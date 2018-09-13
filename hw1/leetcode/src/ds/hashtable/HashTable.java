package ds.hashtable;

public class HashTable {
    String[] hashArray;
    int arraySize;
    int size = 0;

    public HashTable(int noOfSlots){
        if(isPrime(noOfSlots)){
            hashArray = new String[noOfSlots];
            arraySize = noOfSlots;
        }else{
            int primeCount = getNextPrime(noOfSlots);
            hashArray = new String[primeCount];
            arraySize = primeCount;

            System.out.println("Hash table size given "+noOfSlots+"is not a prime number");
            System.out.println("hash table size changed to "+primeCount);

        }
    }

    private boolean isPrime(int num){
        for (int i=2;i*i<num;i++){
            if (num%i==0) return false;
        }
        return true;
    }

    private int getNextPrime(int num){
        for (int i=num;true;i++){
            if (isPrime(i))
                return i;
        }
    }

    private int hashFunc1(String word){
        int hashVal = word.hashCode();
        hashVal = hashVal % arraySize;

        while (hashVal<0){
            hashVal += arraySize;
        }

        return hashVal;
    }

    //return step size greater than 0
    private int hashFunc2(String word){
        int hashVal = word.hashCode();
        hashVal %= arraySize;

        while (hashVal < 0){
            hashVal += arraySize;
        }

        return 3 - hashVal % 3;
    }

    public void insert(String word){
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[hashVal] != null){
            hashVal += stepSize;
            hashVal %= arraySize;
        }

        hashArray[hashVal] = word;
        System.out.println("insert word: "+word);
        size ++;
    }

    public String find(String word){
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);

        while (hashArray[hashVal] != null){
            if (hashArray[hashVal].equals(word)){
                return hashArray[hashVal];
            }
            hashVal += stepSize;
            hashVal %= arraySize;
        }

        return null;
    }
}
