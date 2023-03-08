<!DOCTYPE html>

<html lang="en" dir="ltr">

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="style.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://unicons.iconscout.com/release/v4.0.0/css/line.css">
</head>

<body>

    <?php include 'navbar.php' ?>

    <div class="form signup">
        <div class="title">Registration</div>
        <div class="content">
            <form action="#">
                <div class="user-details">
                    <div class="input-box">
                        <span class="details">First Name</span>
                        <input type="text" placeholder="Enter your first name" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Surname</span>
                        <input type="text" placeholder="Enter your surname" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Email</span>
                        <input type="email" placeholder="Enter your email" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Phone Number</span>
                        <input type="text" placeholder="Enter your number" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Password</span>
                        <input type="password" placeholder="Enter your password" required>
                    </div>
                    <div class="input-box">
                        <span class="details">Confirm Password</span>
                        <input type="password" placeholder="Confirm your password" required>
                    </div>
                </div>
                <div class="gender-details">
                    <input type="radio" name="gender" id="dot-1">
                    <input type="radio" name="gender" id="dot-2">
                    <input type="radio" name="gender" id="dot-3">
                    <span class="gender-title">Gender</span>
                    <div class="category">
                        <label for="dot-1">
                            <span class="dot one"></span>
                            <span class="gender">Male</span>
                        </label>
                        <label for="dot-2">
                            <span class="dot two"></span>
                            <span class="gender">Female</span>
                        </label>
                        <label for="dot-3">
                            <span class="dot three"></span>
                            <span class="gender">Prefer not to say</span>
                        </label>
                    </div>
                </div>

                <div class="checkbox-text">
                    <div class="checkbox-content">
                        <input type="checkbox" id="termCon">
                        <label for="termCon" class="text">I accepted all terms and conditions</label>
                    </div>
                </div>

                <div class="button">
                    <input type="submit" value="Register">
                </div>
            </form>
        </div>
    </div>

    <script src="script.js"></script>

    <?php include 'footer.php' ?>

</body>

</html>

<script src="script.js"></script>