package com.fcg.bluej;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        // Verfügbare Checklisten
        HashMap<OperationType, Checklist> checklists;
        // TODO: fill checklists with excel import


        Operation op1 = new Operation("Toller Name", "Toller Arzt", "Toller Assistent");
        Checklist cl1 = op1.getChecklist();
        LinkedList<ChecklistEntry> einträge = new LinkedList<ChecklistEntry>((List<ChecklistEntry>) cl1.entries);
    }
}
