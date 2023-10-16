package com.thecodeschool.hibrernate;

import com.thecodeschool.hibrernate.service.ProductService;

import java.util.Scanner;

public class HibernateDemo {
    private static ProductService productService = new ProductService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;
        do {
            choice = displayChoice();
            routeChoice(choice);
        } while (choice < 5);

    }

    private static int displayChoice() {
        int choice;

        System.out.print("\n\n");
        System.out.println("+==============Operations==========+");
        System.out.println("|     1 - Display products         |");
        System.out.println("|     2 - Update selected product  |");
        System.out.println("|     3 - Delete selected product  |");
        System.out.println("|     4 - Add product              |");
        System.out.println("|     Any - Exit                   |");
        System.out.println("+==================================+");
        System.out.print("\n\nSelect your choice:");
        choice = scanner.nextInt();
        return choice;
    }

    private static void routeChoice(int choice) {
        switch (choice) {
            case 1:
                    System.out.println("--------------List of Products----------------");
                    productService.displayProducts();
                    System.out.println("----------------------------------------------");
                break;
            case 2:
                System.out.println("--------------Update Product------------------");
                int updateChoice = displayProductUpdateChoice();
                routeUpdateChoice(updateChoice);
                System.out.println("----------------------------------------------");
                break;
            case 3:
                System.out.println("--------------Delete Product------------------");
                System.out.print("Enter productId:");
                int productId = scanner.nextInt();
                int count = productService.deleteProduct(productId);
                System.out.println(String.format("%d Product name deleted successfully.", count));
                System.out.println("----------------------------------------------");
                break;
            case 4:
                System.out.println("----------------Add Product-------------------");
                System.out.print("Enter productId:");
                productId = scanner.nextInt();
                System.out.print("Enter name:");
                String name = scanner.next();
                System.out.print("Enter code:");
                String code = scanner.next();
                System.out.print("Enter quantity:");
                int quantity = scanner.nextInt();
                System.out.print("Enter price:");
                double price = scanner.nextDouble();
                count = productService.addProduct(productId, code, name, quantity, price);
                System.out.println(String.format("%d Product name added successfully.", count));
                System.out.println("----------------------------------------------");
                break;
            default:
                System.out.println(String.format("You have selected: %d.", choice));
                System.out.println("Bye.");
        }
    }

    private static int displayProductUpdateChoice() {
        int choice;

        System.out.print("\n\n");
        System.out.println("+===========Product Update=========+");
        System.out.println("|     1 - Update Price             |");
        System.out.println("|     2 - Update Name              |");
        System.out.println("|     3 - Update Quantity          |");
        System.out.println("|     4 - Update Product Code      |");
        System.out.println("|     Any - Go back to main menu   |");
        System.out.println("+==================================+");
        System.out.print("\n\nSelect your choice:");
        choice = scanner.nextInt();
        return choice;
    }

    private static void routeUpdateChoice(int choice) {
        int productId, count;
        switch (choice) {
            case 1:
                System.out.println("--------------Update Price----------------");
                System.out.print("Enter productId:");
                productId = scanner.nextInt();
                System.out.println();
                System.out.print("Enter price:");
                double price = scanner.nextDouble();
                count = productService.updateProductPrice(productId, price);
                System.out.println(String.format("%d Product price updated successfully.", count));
                System.out.println("------------------------------------------");
                break;
            case 2:
                System.out.println("--------------Update Name----------------");
                System.out.print("Enter productId:");
                productId = scanner.nextInt();
                System.out.println();
                System.out.print("Enter name:");
                String name = scanner.next();
                count = productService.updateProductName(productId, name);
                System.out.println(String.format("%d Product name updated successfully.", count));
                System.out.println("------------------------------------------");
                break;
            case 3:
                System.out.println("--------------Update Quantity----------------");
                System.out.print("Enter productId:");
                productId = scanner.nextInt();
                System.out.println();
                System.out.print("Enter quantity:");
                int quantity = scanner.nextInt();
                count = productService.updateProductQuantity(productId, quantity);
                System.out.println(String.format("%d Product quantity updated successfully.", count));
                System.out.println("---------------------------------------------");
                break;
            case 4:
                System.out.println("--------------Update Product Code----------------");
                System.out.print("Enter productId:");
                productId = scanner.nextInt();
                System.out.println();
                System.out.print("Enter code:");
                String code = scanner.next();
                count = productService.updateProductCode(productId, code);
                System.out.println(String.format("%d Product code updated successfully.", count));
                System.out.println("-------------------------------------------------");
            default:
                System.out.println(String.format("You have selected: %d.", choice));
                System.out.println("Going back to main menu");
        }
    }
}
