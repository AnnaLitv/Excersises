package com.company.lesson10.dao;

import com.company.lesson10.model.Department;
import com.company.lesson10.model.Emploee;
import com.company.lesson10.model.Task;
import com.company.lesson10.utils.ConnectionUtil;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {
    protected Connection con;
    protected PreparedStatement stmt;
    protected ResultSet rs;
    protected ConnectionUtil conObj;
    protected DataSource dataSource;

    public DAO(){
        conObj = new ConnectionUtil();
        try {
            dataSource = conObj.setUpPool();
            con  = dataSource.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void closeConn(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void rollbackConn(){
        try {
            con.rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addTaskForEmploee(Task task, int id) {
        String query = "INSERT INTO task (description, emploeeid) VALUES (?,?);";
        try {
            stmt=con.prepareStatement(query);
            stmt.setString(1,task.getDescription());
            stmt.setInt(2,id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Emploee> selectAllEmploees() {
        List<Emploee> values = new ArrayList<>();
        String query = "SELECT * FROM emploees;";
        try {
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while(rs.next()){
               Emploee emploee = new Emploee();
               emploee.setIdEmploees(rs.getInt("idemploees"));
               emploee.setLastName(rs.getString("last_name"));
               emploee.setFirstName(rs.getString("first_name"));
               emploee.setPosition(rs.getString("position"));
               emploee.setDepartmentId(rs.getInt("department_id"));
               values.add(emploee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return values;
    }
    public List<Task> selectAllTasks() {
        List<Task> values = new ArrayList<>();
        String query = "SELECT * FROM task;";
        try {
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while(rs.next()){
                Task task = new Task();
                task.setEmploeeId(rs.getInt("idtask"));
                task.setDescription(rs.getString("description"));
                task.setEmploeeId(rs.getInt("emploeeid"));
                values.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return values;
    }

    public List<Emploee> selectAllEmploeesOfDepartment(int id) {
        List<Emploee> values = new ArrayList<>();
        String query = "SELECT * FROM emploees WHERE department_id = ?;";
        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1,id);
            rs = stmt.executeQuery();
            while(rs.next()){
                Emploee emploee = new Emploee();
                emploee.setIdEmploees(rs.getInt("idemploees"));
                emploee.setLastName(rs.getString("last_name"));
                emploee.setFirstName(rs.getString("first_name"));
                emploee.setPosition(rs.getString("position"));
                emploee.setDepartmentId(rs.getInt("department_id"));
                values.add(emploee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return values;
    }

    public List<Task> selectAllTasksForEmploee(int id) {
        List<Task> values = new ArrayList<>();
        String query = "SELECT * FROM task WHERE emploeeid = ?;";
        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1,id);
            rs = stmt.executeQuery();
            while(rs.next()){
                Task task = new Task();
                task.setEmploeeId(rs.getInt("idtask"));
                task.setDescription(rs.getString("description"));
                task.setEmploeeId(rs.getInt("emploeeid"));
                values.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return values;
    }

    public void deleteEmoloeeById(int id){
        String query1 = "DELETE FROM task WHERE emploeeid = ?";
        try {
            stmt=con.prepareStatement(query1);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String query = "DELETE FROM emploees WHERE idemploees = ?;";
        try {
            stmt=con.prepareStatement(query);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
