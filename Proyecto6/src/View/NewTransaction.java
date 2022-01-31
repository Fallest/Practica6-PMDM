package View;

/**
 * TO-DO:
 * -Genera una nueva transacción al usar el botón "Generate" con los campos de la
 * izquierda, si "price" es válido.
 * -Se muestran los datos de la nueva orden y transacción en la zona de la derecha.
 * -El botón "cancel" limpia los campos y vuelve al panel Profile.
 */
public class NewTransaction extends javax.swing.JPanel {
    
    private static NewTransaction newTransactionPane = new NewTransaction();
    
    /**
     * Creates new form NewTransaction
     */
    public NewTransaction() {
        initComponents();
    }

    public static NewTransaction getPane() {
        return newTransactionPane;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        transactionsTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        newTransactionPriceLabel = new javax.swing.JLabel();
        deliveryCompanyLabel = new javax.swing.JLabel();
        newTransactionTitle = new javax.swing.JLabel();
        newTransactionPrice = new javax.swing.JTextField();
        deliveryCompanies = new javax.swing.JComboBox<>();
        generateTransaction = new javax.swing.JButton();
        generatedTransaction = new javax.swing.JPanel();
        orderLocLabel = new javax.swing.JLabel();
        orderloc = new javax.swing.JLabel();
        clientLabel = new javax.swing.JLabel();
        clientNif = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        delivererLabel = new javax.swing.JLabel();
        delivererCode = new javax.swing.JLabel();
        orderDelCodeLabel = new javax.swing.JLabel();
        delCostsLabel = new javax.swing.JLabel();
        delCosts = new javax.swing.JLabel();
        orderDelCode = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        newTransactionPriceLabel1 = new javax.swing.JLabel();
        euroLabel = new javax.swing.JLabel();
        clientOrdersLoc = new javax.swing.JComboBox<>();

        transactionsTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        transactionsTitle.setText("Transactions");

        jLabel1.setText("jLabel1");

        newTransactionPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newTransactionPriceLabel.setText("Price:");

        deliveryCompanyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deliveryCompanyLabel.setText("Delivery Company:");

        newTransactionTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        newTransactionTitle.setText("New transaction");

        deliveryCompanies.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Amazon", "UPS", "FedEx" }));

        generateTransaction.setText("Generate >");

        orderLocLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orderLocLabel.setText("Order Loc. ");

        orderloc.setText("orderloc");

        clientLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clientLabel.setText("Client");

        clientNif.setText("clientNif");

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        priceLabel.setText("Price");

        price.setText("price");

        delivererLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delivererLabel.setText("Deliverer Code");

        delivererCode.setText("delCode");

        orderDelCodeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        orderDelCodeLabel.setText("Order Delivery Code");

        delCostsLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        delCostsLabel.setText("Delivery Costs");

        delCosts.setText("delCosts");

        orderDelCode.setText("orderDelCode");

        javax.swing.GroupLayout generatedTransactionLayout = new javax.swing.GroupLayout(generatedTransaction);
        generatedTransaction.setLayout(generatedTransactionLayout);
        generatedTransactionLayout.setHorizontalGroup(
            generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generatedTransactionLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(orderDelCode, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderloc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(generatedTransactionLayout.createSequentialGroup()
                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delCosts, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(orderLocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderDelCodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, generatedTransactionLayout.createSequentialGroup()
                            .addComponent(clientLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delivererLabel))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, generatedTransactionLayout.createSequentialGroup()
                            .addGroup(generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(priceLabel)
                                .addComponent(clientNif, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(delCostsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(delivererCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        generatedTransactionLayout.setVerticalGroup(
            generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(generatedTransactionLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(orderLocLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderloc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientLabel)
                    .addComponent(delivererLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientNif)
                    .addComponent(delivererCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(delCostsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(generatedTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(delCosts))
                .addGap(32, 32, 32)
                .addComponent(orderDelCodeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(orderDelCode)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        cancel.setText("Cancel");

        newTransactionPriceLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        newTransactionPriceLabel1.setText("Order No. :");

        euroLabel.setText("€");

        clientOrdersLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transactionsTitle)
                            .addComponent(cancel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(newTransactionPriceLabel)
                                    .addComponent(newTransactionPriceLabel1))
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(newTransactionPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(euroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(generateTransaction))
                                    .addComponent(clientOrdersLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(deliveryCompanyLabel)
                                .addGap(54, 54, 54)
                                .addComponent(deliveryCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(newTransactionTitle)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(generatedTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(transactionsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(newTransactionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newTransactionPriceLabel1)
                            .addComponent(clientOrdersLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(newTransactionPriceLabel)
                                .addComponent(newTransactionPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(euroLabel))
                            .addComponent(generateTransaction))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deliveryCompanyLabel)
                            .addComponent(deliveryCompanies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancel)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(generatedTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JLabel clientNif;
    private javax.swing.JComboBox<String> clientOrdersLoc;
    private javax.swing.JLabel delCosts;
    private javax.swing.JLabel delCostsLabel;
    private javax.swing.JLabel delivererCode;
    private javax.swing.JLabel delivererLabel;
    private javax.swing.JComboBox<String> deliveryCompanies;
    private javax.swing.JLabel deliveryCompanyLabel;
    private javax.swing.JLabel euroLabel;
    private javax.swing.JButton generateTransaction;
    private javax.swing.JPanel generatedTransaction;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField newTransactionPrice;
    private javax.swing.JLabel newTransactionPriceLabel;
    private javax.swing.JLabel newTransactionPriceLabel1;
    private javax.swing.JLabel newTransactionTitle;
    private javax.swing.JLabel orderDelCode;
    private javax.swing.JLabel orderDelCodeLabel;
    private javax.swing.JLabel orderLocLabel;
    private javax.swing.JLabel orderloc;
    private javax.swing.JLabel price;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel transactionsTitle;
    // End of variables declaration//GEN-END:variables
}
