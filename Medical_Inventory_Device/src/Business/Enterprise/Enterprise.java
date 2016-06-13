/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author Saurabh
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterprisetype;
    private OrganizationDirectory organizationDirectory;

    public Enterprise(String name, EnterpriseType type) {

        super(name);
        this.enterprisetype = type;
        organizationDirectory = new OrganizationDirectory();
    }

    public enum EnterpriseType {

        Hospital("Hospital"),
        Supplier("Supplier"),
        Warehouse("Warehouse"),
        Purchase("Purchase");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;

        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value;
        }

    }

        public abstract ArrayList<Organization> getSupportedOrgnization();
    
    public EnterpriseType getEnterprisetype() {
        return enterprisetype;
    }

    public void setEnterprisetype(EnterpriseType enterprisetype) {
        this.enterprisetype = enterprisetype;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    @Override
    public String toString() {
        return super.getName();
    }

}
