# InterfaceSegregation
This repository contains an implementation of the Interface Segregation Principle (ISP), one of the five principles of SOLID. The principle states that clients should not be forced to depend on interfaces they do not use. This project demonstrates a payment processing system where different types of payment methods (Credit Card, Gopay, and Bank Transfer) are handled by separate, focused interfaces.
### Key Concepts:
Interface Segregation: Each payment method (Credit Card, Gopay, Bank Transfer) has its own specific interface, ensuring that classes only depend on methods they actually use.
SOLID Principles: This code applies the Interface Segregation Principle from SOLID, promoting a modular and maintainable design.
### Structure:
* CreditCardPaymentProcessor: Interface for processing credit card payments.
* GopayPaymentProcessor: Interface for processing Gopay payments.
* BankTransferPaymentProcessor: Interface for processing bank transfer payments.
* Each payment method is implemented by its own service class:
<br>

* CreditCardPaymentService: Implements credit card payment processing.
* GopayPaymentService: Implements Gopay payment processing.
* BankTransferPaymentService: Implements bank transfer payment processing.
