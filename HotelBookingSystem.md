Hotel, Banquet, and Restaurant Booking System
Introduction
This document presents the development of analysis diagrams and storyboarding for the Hotel, Banquet, and Restaurant Booking System. The project focuses on Human-Computer Interaction (HCI) principles, aiming to provide a user-friendly interface and seamless booking process using only HTML, CSS, and JavaScript.
System Flowchart
The flowchart below shows the booking process flow, from selecting the service to receiving confirmation:
1. User opens system →
2. Select service (Hotel / Banquet / Restaurant) →
3. Fill booking form (details, date, people, package) →
4. Submit form →
5. System validates input →
6. Shows confirmation popup →
7. Booking saved (simulated with localStorage).
Entity Relationship Diagram (ERD)
The ERD describes the entities and relationships in the system. Since the implementation uses HTML, CSS, and JS only, this is a conceptual model.
Entities:
- User (UserID, Name, Contact)
- Booking (BookingID, Date, Time, ServiceType, PeopleCount)
- Service (ServiceID, Type: Hotel/Banquet/Restaurant, Price)

Relationships:
- A User can make multiple Bookings.
- A Booking is linked to one Service.
Storyboarding
The storyboard illustrates the user interface screens and interaction flow:
1. Home Page – Navigation options for Hotel, Banquet, Restaurant.
2. Booking Form – Input fields for user details and booking information.
3. Confirmation Popup – After submitting form.
4. Booking Summary – Displays list of bookings.
Sample HTML/CSS/JS Implementation
Below is a simplified code snippet demonstrating the booking form and confirmation popup:

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Booking System</title>
  <style>
    body { font-family: Arial; margin: 20px; }
    .popup { display:none; border:1px solid #000; padding:10px; background:#eee; }
  </style>
</head>
<body>
  <h1>Book a Service</h1>
  <form id="bookingForm">
    <label>Name: <input type="text" required></label><br>
    <label>Service: 
      <select>
        <option>Hotel</option>
        <option>Banquet</option>
        <option>Restaurant</option>
      </select>
    </label><br>
    <button type="submit">Book Now</button>
  </form>

  <div id="popup" class="popup">Booking Confirmed!</div>

  <script>
    document.getElementById('bookingForm').onsubmit = function(e){
      e.preventDefault();
      document.getElementById('popup').style.display = 'block';
    }
  </script>
</body>
</html>

Conclusion
The development of the Hotel, Banquet, and Restaurant Booking System highlights the importance of clear analysis diagrams and user-centered design. By focusing on HCI principles, the system ensures usability, accessibility, and efficiency.
