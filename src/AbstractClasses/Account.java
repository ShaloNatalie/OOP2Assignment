package AbstractClasses;

abstract public class Account {
    protected int id;
    protected String name;
    private Data_Source myData;

    public void performOperation(Data_Source _myData){
        myData = _myData;
        myData.execute();
    }
}