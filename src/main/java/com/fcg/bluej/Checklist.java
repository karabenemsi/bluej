package com.fcg.bluej;

import java.util.LinkedList;
import java.util.List;

public class Checklist {

  private LinkedList<ChecklistEntry> entries;


  public List<ChecklistEntry> getEntries(){
    return this.entries;
  }

  public Checklist(OperationType opType){
    // TODO load entries according to opType from Excel or somewhere else
  }


}
