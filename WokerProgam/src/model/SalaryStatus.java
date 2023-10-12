/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;
/**
 *
 * @author Quắn
 */
public class SalaryStatus {

    private int code;
    private String status;
    private List<SalaryStatus> sList;

    public SalaryStatus(int code, String status) {
        this.code = code;
        this.status = status;
    }

    public List<SalaryStatus> getsList() {
        return sList;
    }

    public void setsList(List<SalaryStatus> sList) {
        this.sList = sList;
    }

    public SalaryStatus() {

    }

    public SalaryStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}
