[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=23400108)
# cpsc39-finalProjects

Upload your final project to this github repo.

Make a README file for your project and put the infor about your project in it - your name, date and what your program does.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
The project is called "_______ Restuarant Ordering System"

This program is designed to list off the menu from the restaurant and provides a few ways to organize the menu, either by price, by name, or by the ID number that is correlated to each menu item. These will make it easier for the users to find the items that they want to order more efficiently.

You can run this program anywhere, whether thats on github or eclipse, since it has no graphics.

Features: It features a CSV data loading from data pulled from an online source with some additions made by me. It includes an option menu for the user to be able to navigate the ordering system more efficiently. The program includes a few ways to search for the menu items that the user wants to order. It provides a virtual shopping cart for user to track what they are going to buy and can add or delete items from the cart before checkout, if needed. And the checkout includes the subtotal and the total with the sales tax included in the total price. 

Data Structure: The data structurtes used in this program are mainly ArrayList's, as well as strings and arrays. All of these Data structures are being used all throughout the program.

Algorithms: The algorithms used Insertions Sort, Binary Search, and Linear Search. Insertion Sort is used to go through the menu, taking one item at a time, and inserting the item in its correct spot between items that are already sorted and this is for organizing the whole menu to list all items from the cheapest item to the most expensive item. Binary Search is used to find an individual item from the menu by having the user enter in the menu item ID. Before the Binary Search is used, there is a sortById method thaty sorts the menu. After that, the Binary Search searches through the sorted list to see whether the ID number that was entered in is in the top half or bottom half of the list, then search through that half adn determine whether its in the top or bottom half of that group, and it keeps doing that until it eventually finds its way to the Id number requested. Linear search is used for when the user wants to search up a specific food item. Once the user types in an item it was to add to their order, the linear search algorithm will search through the whole menu, even if unsorted, and pull that item out and provide it for the user.

*Salvador Abeja*
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~