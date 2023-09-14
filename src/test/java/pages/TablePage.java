package pages;

public class TablePage extends BasePage {
    private String table = "//body/div[@id='root']/div[1]";
    private String mainTable="//tbody";
    public TablePage(){
        super(driver);
    }

    public void navigateToTable(){
        navigateTo("https://1v2njkypo4.csb.app/");
    }

    public String getValueFromTheTable(int row, int column){
        return getValueFromTheTable(table, row, column);
    }
    
    public boolean cellStatus(){
        return elementIsDisplayed(mainTable);
    }

}
