package disobey.adp.impl;

import disobey.adp.ScanAndPrint;

/**
 * Created by student on 2016/03/27.
 */
public class UseScanner implements ScanAndPrint{
    public String print()
    {
        return "prints the paper"; // Interface violation
    }
    public String scan()
    {
       return "Scans the paper";

    }
}
