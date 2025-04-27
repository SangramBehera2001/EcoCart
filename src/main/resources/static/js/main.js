// Simple interactivity placeholder
document.addEventListener("DOMContentLoaded", () => {
    console.log("EcoCart JavaScript loaded!");

    // Example: show alert when user adds product (optional)
    const addToCartButtons = document.querySelectorAll('.add-to-cart-btn');
    addToCartButtons.forEach(btn => {
        btn.addEventListener('click', () => {
            alert('Item added to cart!');
        });
    });
});
