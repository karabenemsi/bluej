package com.fcg.bluej;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Operation
 */
public class Operation {

  private LocalDateTime dateTime;
  private String name;
  private String surgeon;
  private String surgicalAssistant;
  private Checklist checklist;
  private OperationType operationType;

  public Operation(String name, String surgeon, String surgicalAssistant, OperationType operationType,
      LocalDateTime dateTime) {
    this.name = name;
    this.dateTime = dateTime;
    this.surgeon = surgeon;
    this.surgicalAssistant = surgicalAssistant;
    this.operationType = operationType;
    // Set checklist depending on operationType
    this.checklist = new Checklist(this.operationType);
  }
  
  public Operation(String name, String surgeon, String surgicalAssistant) {
    this.name = name;
    this.dateTime = LocalDateTime.now();
    this.surgeon = surgeon;
    this.surgicalAssistant = surgicalAssistant;
    this.operationType = OperationType.Bypass;
    this.checklist = new Checklist(this.operationType);
  }

  public boolean startOperation() {
    // for every checklist check bestand
    return this.checklist.getEntries().stream().map(entry -> entry.getProduct().inStock(entry.getAmountToUse()))
        .reduce(true, (a, b) -> a && b);
  }

  public void endOperation() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurgeon() {
    return surgeon;
  }

  public void setSurgeon(String surgeon) {
    this.surgeon = surgeon;
  }

  public String getSurgicalAssistant() {
    return surgicalAssistant;
  }

  public void setSurgicalAssistant(String surgicalAssistant) {
    this.surgicalAssistant = surgicalAssistant;
  }

  public OperationType getOperationType() {
    return operationType;
  }

  public void setOperationType(OperationType operationType) {
    this.operationType = operationType;
  }

  public void setDateTime(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public void setChecklist(Checklist checklist) {
    this.checklist = checklist;
  }

  public Checklist getChecklist() {
    return this.checklist;
  }

}