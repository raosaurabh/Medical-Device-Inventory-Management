/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.OrganizationManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Saurabh
 */
public class ConfigureABusiness {

    public static EcoSystem configure() {

        EcoSystem system = EcoSystem.getInstance();

        //create network
        //create a enterprise
        //create some organization 
        Employee employee = system.getEmployeeDirectory().createEmployee("Saurabh Rao");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("SysAdmin", "SysAdmin", employee, new SystemAdminRole());
        Employee employee_1 = system.getEmployeeDirectory().createEmployee("Kedar Deshmukh");
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("om", "om", employee_1, new OrganizationManagerRole());
        return system;
    }

}
