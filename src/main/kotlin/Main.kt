import java.util.*

fun main() {
    // Ask the user if they are a residential or business customer
    println("Are you a Residential or Business customer?")
    val customerType = readlnOrNull()?.uppercase(Locale.ROOT)

    // Check and call the appropriate method based on customer type
    when (customerType) {
        "RESIDENTIAL" -> getCustomerInfo()
        "BUSINESS" -> getCustomerInfo(isBusiness = true)
        else -> println("Invalid customer type. Please specify 'Residential' or 'Business'.")
    }
}

// Overloaded method for both residential and business customers
fun getCustomerInfo(isBusiness: Boolean = false) {
    try {
        // Prompt the user to enter customer information
        println("Enter your ${if (isBusiness) "business" else "residential"} name:")
        val name = readlnOrNull()

        // For business customers, prompt for the contact name
        val contactName = if (isBusiness) {
            println("Enter your contact name:")
            readlnOrNull()
        } else {
            null
        }

        println("Enter your phone number:")
        val phoneNumber = readlnOrNull()

        // Display customer information
        println("${if (isBusiness) "Business" else "Residential"} Customer Information:")
        println("Name: $name")
        if (isBusiness) {
            println("Contact Name: $contactName")
        }
        println("Phone Number: $phoneNumber")
    } catch (e: Exception) {
        println("Error: ${e.message}")
    }
}


