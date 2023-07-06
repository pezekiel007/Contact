# Contact
This is an app that displays a list of contacts using their names and phone numbers.

This app shows shows the basic use and implementation of the recyclerView using Android Studio IDE and Kotlin Programming Language.

Below are steps one can use to get the through to implement the recyclerView on a less complex level:

STEPS TO IMPLEMENT A RECYCLER VIEW (Display Only on Scrollable List)

1. Bring in the data for display.
    Put the data in Strings.xml located inside the res folder (package).

2. Create variables to model the data.
    Create a data class; Create variables or parameters to model data;
    Give them (variables) a type of Int.

3. Create a data source (should contain already modeled data)
    Create a class; In side the class, Create a function that will return a
    list of your modeled and organized data.

4. Create a layout to depict the design of the contacts.
    Create a layout resource file; Using views and /or view groups, design the
    way you want your contacts to look like.

5. Create the recycler View
    Pull in the recyclerview view on the xml that you want to display it.

6. Create the Adapter that will automate the display on the recycler view.
    Create an Adapter class; Create a ViewHolder class; Implement the
    members of the Adapter class.

7. Call or Implement the recycler view
    In the activity.kt class which is a pair of the xml layout resource file;
    Implement the business logic to complete the recycler View.

PS: The above steps are not a must to follow but using my discretion, it leaves a path of no errors behind each step taken.
