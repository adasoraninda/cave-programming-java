package section3;

public class Database implements AutoCloseable {

    private String connectionStr;

    /**
     * Exception constructor
     */
    public Database(String connectionStr) throws Exception{
        System.out.println("Opening connection to " + connectionStr);

        if(connectionStr == null){
            throw new Exception("Cannot connect to db " + connectionStr);
        }

        this.connectionStr = connectionStr;

        System.out.println("Connection connected");
    }

    public void getData() throws Exception{
        System.out.println("Getting data from " + connectionStr);

        if(connectionStr.length() < 3){
            throw new Exception("Cannot get data from db " + connectionStr);
        }

        System.out.println("Successfully get data");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing db connection ...");        

        if(connectionStr.length() > 5){
            throw new Exception("Cannot close db " + connectionStr);
        }

        System.out.println("Connection closed");
    }
    
}
