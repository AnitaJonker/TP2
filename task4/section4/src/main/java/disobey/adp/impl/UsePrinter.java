package disobey.adp.impl;

import disobey.adp.PrinterInventory;
import disobey.adp.ScanAndPrint;

/**
 * Created by student on 2016/03/27.
 */
public class UsePrinter implements ScanAndPrint {

    public String print()
    {
        PrinterInventory inventory = new PrinterInventory();
        if(inventory.getPaperAmount() > 0) // DIP violation
        {
         return "Prints the paper"   ;
        }
        else
        {
            return "Out of paper";
        }

    }
    public String scan()
    {
        return "Scans the paper"; // Interface violation
    }


}
