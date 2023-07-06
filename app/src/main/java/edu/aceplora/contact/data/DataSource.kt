package edu.aceplora.contact.data

import edu.aceplora.contact.R
import edu.aceplora.contact.model.Contact

class DataSource {

    fun loadContacts(): List<Contact> {
        return listOf(
            Contact(R.string.contact_1, R.string.phone_1),
            Contact(R.string.contact_2, R.string.phone_2),
            Contact(R.string.contact_3, R.string.phone_3),
            Contact(R.string.contact_4, R.string.phone_4),
            Contact(R.string.contact_5, R.string.phone_5),
            Contact(R.string.contact_1, R.string.phone_1),
            Contact(R.string.contact_2, R.string.phone_2),
            Contact(R.string.contact_3, R.string.phone_3),
            Contact(R.string.contact_4, R.string.phone_4),
            Contact(R.string.contact_5, R.string.phone_5),
            Contact(R.string.contact_1, R.string.phone_1),
            Contact(R.string.contact_2, R.string.phone_2),
            Contact(R.string.contact_3, R.string.phone_3),
            Contact(R.string.contact_4, R.string.phone_4),
            Contact(R.string.contact_5, R.string.phone_5)
        )
    }
}
