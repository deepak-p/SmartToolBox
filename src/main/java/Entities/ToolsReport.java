/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author deepak
 */
public class ToolsReport {

    private String toolName;
    private String type;
    private String status;
    private Long tool_id;
    private int checkouts;


    public ToolsReport() {
    }

    
    public ToolsReport(String toolName, String type, String status, Long tool_id, int checkouts) {
        this.toolName = toolName;
        this.type = type;
        this.status = status;
        this.tool_id = tool_id;
        this.checkouts = checkouts;
    }

    public String getToolName() {
        return toolName;
    }

    public void setToolName(String toolName) {
        this.toolName = toolName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTool_id() {
        return tool_id;
    }

    public void setTool_id(Long tool_id) {
        this.tool_id = tool_id;
    }

    public int getCheckouts() {
        return checkouts;
    }

    public void setCheckouts(int checkouts) {
        this.checkouts = checkouts;
    }

    @Override
    public String toString() {
        return "ToolsReport{" + "toolName=" + toolName + ", type=" + type + ", status=" + status + ", tool_id=" + tool_id + ", checkouts=" + checkouts + '}';
    }

    

   

    
}
