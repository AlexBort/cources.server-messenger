package message;

/**
 * Created by User on 09.03.2017.
 */
public class ContactsSyncRequest {


    private String addedContacts;                  // :[<Contact>, ... ]
    private String removedContacts;          // :[<Contact>, ... ]

    public String getAddedContacts() {
        return addedContacts;
    }

    public void setAddedContacts(String addedContacts) {
        this.addedContacts = addedContacts;
    }

    public String getRemovedContacts() {
        return removedContacts;
    }

    public void setRemovedContacts(String removedContacts) {
        this.removedContacts = removedContacts;
    }


}
