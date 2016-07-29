package pt.ist.fenixedu.bpi;

import java.util.List;

import pt.ist.fenixedu.bpi.webservice.BPISyncException_Exception;
import pt.ist.fenixedu.bpi.webservice.BPISyncWebService;
import pt.ist.fenixedu.bpi.webservice.BPISyncWebServiceService;
import pt.ist.fenixedu.bpi.webservice.BpiSyncBean;

public class DoSomeStuff {

    public static void main(String[] args) {
        final BPISyncWebServiceService service = new BPISyncWebServiceService();
        final BPISyncWebService port = service.getBPISyncWebServicePort();

        testFail(port);
        testOk(port);
    }

    private static void testOk(BPISyncWebService port) {
        try {
            final BpiSyncBean bean = port.getUser("225146649");
            final String name = bean.getName();
            final String email = bean.getEmail();
            final String address = bean.getAddress();
            final String borough = bean.getBorough();
            final String county = bean.getCounty();
            final String dateOfBirth = bean.getDateOfBirth();
            final String degree = bean.getDegree();
            final String degreeType = bean.getDegreeType();
            final String district = bean.getDistrict();
            final String fiscal = bean.getFiscal();
            final char gender = (char) bean.getGender();
            final String id = bean.getId();
            final String idDocumentNumber = bean.getIdDocumentNumber();
            final String idDocumentValidity = bean.getIdDocumentValidity();
            final String nationality = bean.getNationality();
            final String phone = bean.getPhone();
            final String placeOfBirth = bean.getPlaceOfBirth();
            final String streetLayoutCode = bean.getStreetLayoutCode();
            final String zipCode = bean.getZipCode();
            final byte[] enrolmentAgreement = bean.getEnrolmentAgreement();

            System.out.println("Found user: " + email + " a.k.a.: " + name);
            System.out.println("   address: " + address);
            System.out.println("   borough: " + borough);
            System.out.println("   county: " + county);
            System.out.println("   dateOfBirth: " + dateOfBirth);
            System.out.println("   degree: " + degree);
            System.out.println("   degreeType: " + degreeType);
            System.out.println("   district: " + district);
            System.out.println("   fiscal: " + fiscal);
            System.out.println("   gender: " + gender);
            System.out.println("   id: " + id);
            System.out.println("   idDocumentNumber: " + idDocumentNumber);
            System.out.println("   idDocumentValidity: " + idDocumentValidity);
            System.out.println("   nationality: " + nationality);
            System.out.println("   phone: " + phone);
            System.out.println("   placeOfBirth: " + placeOfBirth);
            System.out.println("   streetLayoutCode: " + streetLayoutCode);
            System.out.println("   zipCode: " + zipCode);
        } catch (final BPISyncException_Exception e) {
            throw new Error("Should not have failed");
        }
    }

    private static void testFail(BPISyncWebService port) {
        try {
            port.getUser("219287074");
            throw new Error("Should have failed");
        } catch (final BPISyncException_Exception e) {
            // all is ok... expected to fail because this user did not authorise anything
        }
    }

}
