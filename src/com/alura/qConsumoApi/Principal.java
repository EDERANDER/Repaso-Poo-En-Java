package com.alura.qConsumoApi;

import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Principal {
    private static final Map<String, String> monedas = new HashMap<>();

    static {
        monedas.put("Dirham de los EAU", "AED");
        monedas.put("Afgani afgano", "AFN");
        monedas.put("Lek albanes", "ALL");
        monedas.put("Dram armenio", "AMD");
        monedas.put("Florin antillano neerlandes", "ANG");
        monedas.put("Kwanza angoleno", "AOA");
        monedas.put("Peso argentino", "ARS");
        monedas.put("Dolar australiano", "AUD");
        monedas.put("Florin arubeño", "AWG");
        monedas.put("Manat azerbaiyano", "AZN");
        monedas.put("Marco bosnioherzegovino", "BAM");
        monedas.put("Dolar de Barbados", "BBD");
        monedas.put("Taka bangladesi", "BDT");
        monedas.put("Lev bulgaro", "BGN");
        monedas.put("Dinar bahreini", "BHD");
        monedas.put("Franco burundes", "BIF");
        monedas.put("Dolar bermudeño", "BMD");
        monedas.put("Dolar de Brunei", "BND");
        monedas.put("Boliviano", "BOB");
        monedas.put("Real brasileño", "BRL");
        monedas.put("Dolar bahameño", "BSD");
        monedas.put("Ngultrum butanes", "BTN");
        monedas.put("Pula botsuano", "BWP");
        monedas.put("Rublo bielorruso", "BYN");
        monedas.put("Dolar beliceño", "BZD");
        monedas.put("Dolar canadiense", "CAD");
        monedas.put("Franco congoleño", "CDF");
        monedas.put("Franco suizo", "CHF");
        monedas.put("Peso chileno", "CLP");
        monedas.put("Yuan chino", "CNY");
        monedas.put("Peso colombiano", "COP");
        monedas.put("Colon costarricense", "CRC");
        monedas.put("Peso cubano", "CUP");
        monedas.put("Escudo caboverdiano", "CVE");
        monedas.put("Corona checa", "CZK");
        monedas.put("Franco yibutiano", "DJF");
        monedas.put("Corona danesa", "DKK");
        monedas.put("Peso dominicano", "DOP");
        monedas.put("Dinar argelino", "DZD");
        monedas.put("Libra egipcia", "EGP");
        monedas.put("Nakfa eritreo", "ERN");
        monedas.put("Birr etiope", "ETB");
        monedas.put("Euro", "EUR");
        monedas.put("Dolar fiyiano", "FJD");
        monedas.put("Libra malvinense", "FKP");
        monedas.put("Corona feroesa", "FOK");
        monedas.put("Libra esterlina", "GBP");
        monedas.put("Lari georgiano", "GEL");
        monedas.put("Libra de Guernsey", "GGP");
        monedas.put("Cedi ghanes", "GHS");
        monedas.put("Libra gibraltareña", "GIP");
        monedas.put("Dalasi gambiano", "GMD");
        monedas.put("Franco guineano", "GNF");
        monedas.put("Quetzal guatemalteco", "GTQ");
        monedas.put("Dolar guyanes", "GYD");
        monedas.put("Dolar de Hong Kong", "HKD");
        monedas.put("Lempira hondureño", "HNL");
        monedas.put("Kuna croata", "HRK");
        monedas.put("Gourde haitiano", "HTG");
        monedas.put("Forinto hungaro", "HUF");
        monedas.put("Rupia indonesia", "IDR");
        monedas.put("Nuevo sekel israeli", "ILS");
        monedas.put("Libra de Man", "IMP");
        monedas.put("Rupia india", "INR");
        monedas.put("Dinar iraqui", "IQD");
        monedas.put("Rial irani", "IRR");
        monedas.put("Corona islandesa", "ISK");
        monedas.put("Libra de Jersey", "JEP");
        monedas.put("Dolar jamaiquino", "JMD");
        monedas.put("Dinar jordano", "JOD");
        monedas.put("Yen japones", "JPY");
        monedas.put("Chelin keniano", "KES");
        monedas.put("Som kirguis", "KGS");
        monedas.put("Riel camboyano", "KHR");
        monedas.put("Dolar de Kiribati", "KID");
        monedas.put("Franco comorense", "KMF");
        monedas.put("Won surcoreano", "KRW");
        monedas.put("Dinar kuwaiti", "KWD");
        monedas.put("Dolar de Islas Caiman", "KYD");
        monedas.put("Tenge kazajo", "KZT");
        monedas.put("Kip laosiano", "LAK");
        monedas.put("Libra libanesa", "LBP");
        monedas.put("Rupia de Sri Lanka", "LKR");
        monedas.put("Dolar liberiano", "LRD");
        monedas.put("Loti lesotense", "LSL");
        monedas.put("Dinar libio", "LYD");
        monedas.put("Dirham marroqui", "MAD");
        monedas.put("Leu moldavo", "MDL");
        monedas.put("Ariary malgache", "MGA");
        monedas.put("Denar macedonio", "MKD");
        monedas.put("Kyat birmano", "MMK");
        monedas.put("Togrog mongol", "MNT");
        monedas.put("Pataca macaense", "MOP");
        monedas.put("Ouguiya mauritana", "MRU");
        monedas.put("Rupia mauriciana", "MUR");
        monedas.put("Rufiyaa maldiva", "MVR");
        monedas.put("Kwacha malaui", "MWK");
        monedas.put("Peso mexicano", "MXN");
        monedas.put("Ringgit malayo", "MYR");
        monedas.put("Metical mozambiqueño", "MZN");
        monedas.put("Dolar namibio", "NAD");
        monedas.put("Naira nigeriana", "NGN");
        monedas.put("Cordoba nicaraguense", "NIO");
        monedas.put("Corona noruega", "NOK");
        monedas.put("Rupia nepalesa", "NPR");
        monedas.put("Dolar neozelandes", "NZD");
        monedas.put("Rial de Oman", "OMR");
        monedas.put("Balboa panameño", "PAB");
        monedas.put("Sol peruano", "PEN");
        monedas.put("Kina papuana", "PGK");
        monedas.put("Peso filipino", "PHP");
        monedas.put("Rupia pakistaní", "PKR");
        monedas.put("Zloty polaco", "PLN");
        monedas.put("Guarani paraguayo", "PYG");
        monedas.put("Riyal catarí", "QAR");
        monedas.put("Leu rumano", "RON");
        monedas.put("Dinar serbio", "RSD");
        monedas.put("Rublo ruso", "RUB");
        monedas.put("Franco ruandes", "RWF");
        monedas.put("Riyal saudí", "SAR");
        monedas.put("Dolar de las Islas Salomon", "SBD");
        monedas.put("Rupia de Seychelles", "SCR");
        monedas.put("Libra sudanesa", "SDG");
        monedas.put("Corona sueca", "SEK");
        monedas.put("Dolar singapurense", "SGD");
        monedas.put("Libra de Santa Elena", "SHP");
        monedas.put("Leone de Sierra Leona", "SLE");
        monedas.put("Chelin somali", "SOS");
        monedas.put("Dolar surinames", "SRD");
        monedas.put("Libra sursudanesa", "SSP");
        monedas.put("Dobra de Santo Tome y Principe", "STN");
        monedas.put("Libra siria", "SYP");
        monedas.put("Lilangeni esuatini", "SZL");
        monedas.put("Baht tailandes", "THB");
        monedas.put("Somoni tayiko", "TJS");
        monedas.put("Manat turcomano", "TMT");
        monedas.put("Dinar tunecino", "TND");
        monedas.put("Paanga tongano", "TOP");
        monedas.put("Lira turca", "TRY");
        monedas.put("Dolar de Trinidad y Tobago", "TTD");
        monedas.put("Dolar tuvaluano", "TVD");
        monedas.put("Nuevo dolar taiwanes", "TWD");
        monedas.put("Chelin tanzano", "TZS");
        monedas.put("Grivna ucraniana", "UAH");
        monedas.put("Chelin ugandes", "UGX");
        monedas.put("Dolar estadounidense", "USD");
        monedas.put("Peso uruguayo", "UYU");
        monedas.put("Som uzbeco", "UZS");
        monedas.put("Bolivar venezolano", "VES");
        monedas.put("Dong vietnamita", "VND");
        monedas.put("Vatu vanuatuense", "VUV");
        monedas.put("Tala samoano", "WST");
        monedas.put("Franco CFA de Africa Central", "XAF");
        monedas.put("Dolar del Caribe Oriental", "XCD");
        monedas.put("Derechos Especiales de Giro", "XDR");
        monedas.put("Franco CFA de Africa Occidental", "XOF");
        monedas.put("Franco CFP", "XPF");
        monedas.put("Rial yemeni", "YER");
        monedas.put("Rand sudafricano", "ZAR");
        monedas.put("Kwacha zambiana", "ZMW");
        monedas.put("Dolar zimbabuense", "ZWL");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        SplashScreen splashScreen = new SplashScreen();
        splashScreen.showSplash();
        Gson gson = new Gson();

        JFrame frame = new JFrame("Conversor De Moneda En Tiempo Real");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FondoPanel panel = new FondoPanel("src/com/alura/qConsumoApi/imagen.jpg");
        panel.setLayout(null);

        JLabel label1 = new JLabel("Ingrese nombre moneda base: ");
        label1.setBounds(20, 20, 300, 30);
        label1.setFont(new Font("Arial", Font.BOLD, 18));
        label1.setForeground(Color.white);

        JComboBox<String> comboBox1 = new JComboBox<>(monedas.keySet().toArray(new String[0]));
        comboBox1.setBounds(350, 20, 200, 30); // Aumentamos el ancho a 200
        comboBox1.setFont(new Font("Arial", Font.PLAIN, 18));
        comboBox1.setEditable(true);
        comboBox1.setMaximumRowCount(10);
        comboBox1.setSelectedItem("");

        comboBox1.getEditor().getEditorComponent().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                String text = ((JTextField) comboBox1.getEditor().getEditorComponent()).getText();
                updateComboBox(comboBox1, text);
            }

            private void updateComboBox(JComboBox<String> comboBox, String text) {
                comboBox.removeAllItems();
                for (String moneda : monedas.keySet().stream().filter(moneda -> moneda.toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList())) {
                    comboBox.addItem(moneda);
                }
                ((JTextField) comboBox.getEditor().getEditorComponent()).setText(text);
                comboBox.showPopup();
            }
        });

        JLabel label2 = new JLabel("Ingrese cantidad moneda base: ");
        label2.setBounds(20, 70, 300, 30);
        label2.setFont(new Font("Arial", Font.BOLD, 18));
        label2.setForeground(Color.white);

        JTextField textField2 = new JTextField(10);
        textField2.setBounds(350, 70, 150, 30);
        textField2.setFont(new Font("Arial", Font.PLAIN, 18));

        JLabel label3 = new JLabel("¿Moneda a convertir?: ");
        label3.setBounds(20, 120, 300, 30);
        label3.setFont(new Font("Arial", Font.BOLD, 18));
        label3.setForeground(Color.white);

        JComboBox<String> comboBox3 = new JComboBox<>(monedas.keySet().toArray(new String[0]));
        comboBox3.setBounds(350, 120, 200, 30); // Aumentamos el ancho a 200
        comboBox3.setFont(new Font("Arial", Font.PLAIN, 18));
        comboBox3.setEditable(true);
        comboBox3.setSelectedItem("");

        comboBox3.getEditor().getEditorComponent().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                String text = ((JTextField) comboBox3.getEditor().getEditorComponent()).getText();
                updateComboBox(comboBox3, text);
            }

            private void updateComboBox(JComboBox<String> comboBox, String text) {
                comboBox.removeAllItems();
                for (String moneda : monedas.keySet().stream().filter(moneda -> moneda.toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList())) {
                    comboBox.addItem(moneda);
                }
                ((JTextField) comboBox.getEditor().getEditorComponent()).setText(text);
                comboBox.showPopup();
            }
        });

        JButton button = new JButton("Enviar");
        button.setBounds(250, 200, 150, 40);
        button.setFont(new Font("Arial", Font.ITALIC, 20));

        JButton button2 = new JButton("Nueva Consulta");
        button2.setBounds(230, 400, 200, 40);
        button2.setFont(new Font("Arial", Font.BOLD, 20));
        button2.setForeground(Color.RED);

        JLabel respuesta = new JLabel("Resultado: ");
        respuesta.setBounds(190, 250, 600, 120);
        respuesta.setFont(new Font("Arial", Font.BOLD, 20));
        respuesta.setForeground(Color.white);

        button.addActionListener(e -> {
            String base_moneda_nombre = comboBox1.getSelectedItem() != null ? comboBox1.getSelectedItem().toString() : "";
            String base_moneda = monedas.get(base_moneda_nombre);
            String cant = textField2.getText();
            String conver_moneda_nombre = comboBox3.getSelectedItem() != null ? comboBox3.getSelectedItem().toString() : "";
            String conver = monedas.get(conver_moneda_nombre);

            if (base_moneda == null || conver == null) {
                respuesta.setText("Moneda no válida");
                return;
            }

            String direccionSolicitudApi = "https://v6.exchangerate-api.com/v6/9b20dd28b886c7892ba9674c/pair/"
                    + base_moneda + "/" + conver + "/" + cant;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccionSolicitudApi))
                    .build();

            HttpResponse<String> response;
            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String respuestaJson = response.body();
                DtoConversor dto = gson.fromJson(respuestaJson, DtoConversor.class);
                Conversor conversor = new Conversor(dto);
                respuesta.setText("Resultado: " + conversor.resultado);
            } catch (IOException | InterruptedException ex) {
                ex.printStackTrace();
            }
        });

        button2.addActionListener(e -> {
            comboBox1.setSelectedItem("");
            textField2.setText("");
            comboBox3.setSelectedItem("");
            respuesta.setText("Resultado: ");
        });

        panel.add(label1);
        panel.add(comboBox1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(comboBox3);
        panel.add(button);
        panel.add(button2);
        panel.add(respuesta);

        frame.getContentPane().add(panel);
        frame.setSize(900, 645);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}