/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

public class Surgery {

    private SurgeryType surgeryType;

    public enum SurgeryType {

        Heart("Heart Surgery"),
        Dental("Dental Surgery"),
        Orthropedic("Orthopedic Surgery"),
        Urology("Urological Surgery"),
        Eye("Opthamological Surgery"),
        Skin("Dermatological Surgery"),
        Intestinal("Inastrological Surgery");

        private String value;

        private SurgeryType(String value) {
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

    public SurgeryType getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(SurgeryType surgeryType) {
        this.surgeryType = surgeryType;
    }

}
