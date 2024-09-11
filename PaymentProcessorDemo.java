public class PaymentProcessorDemo {
    
    // Interface khusus untuk pembayaran kartu kredit
    public static interface CreditCardPaymentProcessor {
        void processCreditCardPayment(String cardNumber, double amount);
    }

    // Interface khusus untuk pembayaran Gopay
    public static interface GopayPaymentProcessor {
        void processGopayPayment(String telpNumber, double amount);
    }

    // Interface khusus untuk pembayaran transfer bank
    public static interface BankTransferPaymentProcessor {
        void processBankTransferPayment(String bankAccount, double amount);
    }

    // Kelas yang mendukung pembayaran dengan kartu kredit
    public static class CreditCardPaymentService implements CreditCardPaymentProcessor {

        @Override
        public void processCreditCardPayment(String cardNumber, double amount) {
            System.out.println("Processing credit card payment of Rp " + amount + " using card: " + cardNumber);
        }
    }

    // Kelas yang mendukung pembayaran dengan Gopay
    public static class GopayPaymentService implements GopayPaymentProcessor {

        @Override
        public void processGopayPayment(String telpNumber, double amount) {
            System.out.println("Processing Gopay payment of Rp" + amount + " to phone number: " + telpNumber);
        }
    }

    // Kelas yang mendukung pembayaran dengan transfer bank
    public static class BankTransferPaymentService implements BankTransferPaymentProcessor {

        @Override
        public void processBankTransferPayment(String bankAccount, double amount) {
            System.out.println("Processing bank transfer of Rp" + amount + " to account: " + bankAccount);
        }
    }

    // Metode utama untuk simulasi sistem pembayaran
    public static void main(String[] args) {
        // Simulasi pembayaran menggunakan kartu kredit
        CreditCardPaymentProcessor creditCardPaymentProcessor = new CreditCardPaymentService();
        creditCardPaymentProcessor.processCreditCardPayment("1234-5678-9012-3456", 1500000.00);

        // Simulasi pembayaran menggunakan Gopay
        GopayPaymentProcessor gopayPaymentProcessor = new GopayPaymentService();
        gopayPaymentProcessor.processGopayPayment("085652241217", 500000.00);

        // Simulasi pembayaran menggunakan transfer bank
        BankTransferPaymentProcessor bankTransferPaymentProcessor = new BankTransferPaymentService();
        bankTransferPaymentProcessor.processBankTransferPayment("9876543210", 1200000.00);
    }
}
