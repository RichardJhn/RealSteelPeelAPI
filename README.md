Real Steel Peel - Easy Shop
------------------------------------------------------------------------------------------------------
- This was my third and final capstone project for the Year Up United LTCA program. The project involved resolving multiple backend issues, which I addressed by using Insomnia, SQL, and Java to identify, debug, and correct defects.
------------------------------------------------------------------------------------------------------
Things the user can do
------------------------------------------------------------------------------------------------------
- Register a new profile
- Log in
- Browse all availble products
- Search products by categories, subcategories and price range
------------------------------------------------------------------------------------------------------
Testing using Insomnia
------------------------------------------------------------------------------------------------------
<img width="2496" height="956" alt="Testing" src="https://github.com/user-attachments/assets/1c8c30c1-7a53-41cc-96e0-969c060a148f" />

------------------------------------------------------------------------------------------------------
Phase 1
------------------------------------------------------------------------------------------------------
- Added code to empty methods
- added proper annotations in the controller
- Only admin roles can now insert, update or delete categories
- implemented code to make MySqlCategoriesDao function
------------------------------------------------------------------------------------------------------
Phase 2
------------------------------------------------------------------------------------------------------
- Only admin can insert, update or delete products
- fixed search functionality where the min and max price wasn't showing correct results
- fixed a duplicate error where items were inserted instead of updated
------------------------------------------------------------------------------------------------------
Small front-end fix
------------------------------------------------------------------------------------------------------
- The search function was showing 2 minimum price options. I was able to look through the HTML and change it to maximum.
<img width="350" height="332" alt="Screenshot 2025-12-19 004930" src="https://github.com/user-attachments/assets/086d85c7-7b05-4d95-81ba-123c6b457948" />

- This is where the error was. The front end code had 2 minimums instead of maximum as I fixed in this picture.
<img width="979" height="186" alt="Front end error" src="https://github.com/user-attachments/assets/657401e6-6917-4255-94d0-81d0d359f112" />



------------------------------------------------------------------------------------------------------

Interesting piece of code
------------------------------------------------------------------------------------------------------
- I learned a lot about using annotations in this capstone project. The @RestController annotation indicates that the class handles HTTP requests and returns data in JSON format. The @RequestMapping annotation sets the base URL path for the controller, while @CrossOrigin allows the API to be accessed by a frontend application running on a different origin.

<img width="885" height="401" alt="cap3 intersting code" src="https://github.com/user-attachments/assets/2681910e-617d-485e-b812-ba8fa47b6442" />




------------------------------------------------------------------------------------------------------
Technologies used
------------------------------------------------------------------------------------------------------
- Springboot
- Java
- SQL
- Insomnia
------------------------------------------------------------------------------------------------------
