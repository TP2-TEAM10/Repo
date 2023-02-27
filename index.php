<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home</title>
</head>

<style>
    .mainimg {
        max-width: 100%;
        max-height: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
        filter: blur(2px);
        z-index: -1;
    }

    .image-container {
        position: relative;
    }

    .image-text-main {
        position: absolute;
        top: 20%;
        left: 20%;
        color: white;
        font-size: 50px;
        font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
    }

    .image-text-sec {
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
        z-index: 1;
        color: white;
        text-align: center;
        font-family: 'Courier New', Courier, monospace;
        font-size: 30px;
    }

    .brands {
        display: inline-block;
        width: 200px;
        height: 120px;
        margin: 10px;
        border: 1.7px solid black;
        background-color: white;
        box-sizing: border-box;
    }

    .brands-container {
        position: absolute;
        top: 60%;
        width: 100%;
        display: flex;
        justify-content: center;
        align-items: center;
        flex-wrap: wrap;
    }

    .brands img {
        width: 100%;
        height: 100%;
    }

    .brands:hover {
        border: 2px solid #bf1E2E;
    }

    .highlight {
        color: #bf1E2E;
    }
</style>

<body>
    <?php include 'navbar.php' ?>

    <div class="image-container">
        <img src="images/indexbmw.png" class="mainimg">
        <div class="image-text-main">
            <p>We Provide <span class="highlight">Luxury Cars</span></p>
            <p>at low cost.</p>
        </div>
        <div class="image-text-sec">
            <p>SHOP BY BRANDS:</p>
        </div>
        <div class="brands-container">
            <button class="brands">
                <a href="products.php">
                    <img src="images/bmw-logo.png">
                </a>
            </button>
            <button class="brands">
                <a href="products.php">
                    <img src="images/mb.png">
                </a>
            </button>
            <button class="brands">
                <a href="products.php">
                    <img src="images/Logo_Toyota.png">
                </a>
            </button>
            <button class="brands">
                <a href="products.php">
                    <img src="images/vw1.png">
                </a>
            </button>
            <button class="brands">
                <a href="products.php">
                    <img src="images/Logo_AUDI2.png">
                </a>
            </button>
        </div>

        <?php include 'footer.php' ?>

</body>

</html>