package news_application;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Objects;


public class Categories extends JFrame {
    private JEditorPane newsEditorPane;
    private JComboBox<String> categoryComboBox;

    public Categories() {                                      //CONSTRUCTOR
        super("RG NEWS APP");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
        fetchAndDisplayNews();

        // TIMER TO REFRESH  IN 30 secs 
        Timer timer = new Timer(30000, e -> fetchAndDisplayNews());
        timer.start();
    }

    private void initComponents() {     //FUNCTION TO  INITIALISE  SWING  COMPONENTS 
        // Create components
        
        
        newsEditorPane = new JEditorPane();    // FOR DISPLAYING NEWS
        newsEditorPane.setEditable(false);
        
   
        getContentPane().add(new JScrollPane(newsEditorPane), BorderLayout.CENTER);

 
        JButton refreshButton = new JButton("Refresh");  // FOR REFRESHING

        // COMBO BOX 
        String[] categories = {"ALL", "TECHNOLOGY", "BUSINESS", "SPORTS", "ENTERTAINMENT", "SCIENCE", "HEALTH", "POLITICS"};
        categoryComboBox = new JComboBox<>(categories);
        categoryComboBox.addActionListener(e -> fetchAndDisplayNews()); // CALLING FUCTION TO DISPLAY NEWS 

        // Set component properties
        newsEditorPane.setContentType("text/html");
        newsEditorPane.setEditable(false);
         refreshButton.addActionListener(e -> fetchAndDisplayNews());
         
        // FOR WORKING OF ALL LINKS
        newsEditorPane.addHyperlinkListener(new HyperlinkListener() {
            @Override
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    try {
                        Desktop.getDesktop().browse(e.getURL().toURI());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        // Set layout manager
        getContentPane().setLayout(new BorderLayout());

        // Add components to the content pane
        getContentPane().add(createToolbar(refreshButton), BorderLayout.NORTH);
        getContentPane().add(new JScrollPane(newsEditorPane), BorderLayout.CENTER);

        // Set up button action
        refreshButton.addActionListener(e -> fetchAndDisplayNews());
    }

 private JPanel createToolbar(JButton refreshButton) {       // FOR NAV BAR 
    JPanel toolbar = new JPanel(new GridBagLayout());
    toolbar.setBorder(new EmptyBorder(10, 10, 10, 10));

    // title label 
    GridBagConstraints titleConstraints = new GridBagConstraints();
    titleConstraints.gridx = 0;
    titleConstraints.gridy = 0;
    titleConstraints.gridwidth = 3; // Span the entire width
    titleConstraints.weightx = 1.0;
    titleConstraints.fill = GridBagConstraints.CENTER;

    //  category combo box 
    GridBagConstraints categoryComboBoxConstraints = new GridBagConstraints();
    categoryComboBoxConstraints.gridx = 0;
    categoryComboBoxConstraints.gridy = 1;
    categoryComboBoxConstraints.gridwidth = 3; // Span the entire width
    categoryComboBoxConstraints.anchor = GridBagConstraints.CENTER;

    // refresh button 
    GridBagConstraints refreshButtonConstraints = new GridBagConstraints();
    refreshButtonConstraints.gridx = 0;
    refreshButtonConstraints.gridy = 2;
    refreshButtonConstraints.gridwidth = 3; // Span the entire width
    refreshButtonConstraints.anchor = GridBagConstraints.CENTER;


    JLabel titleLabel = new JLabel("<html><span style='font-family: \"Lucida Handwriting\", cursive; font-size: 48pt; color: #4CAF50; text-shadow: 2px 2px 4px #000000;'>RG NEWS</span></html>");
    toolbar.add(titleLabel, titleConstraints);

//SPACING
    toolbar.add(Box.createVerticalStrut(20));

    // Add the category combo box with improved styling
    categoryComboBox.setPreferredSize(new Dimension(250, 40));
    categoryComboBox.setFont(new Font("Arial", Font.PLAIN, 16));
    categoryComboBox.setForeground(Color.BLACK); // Blue color
    categoryComboBox.setBackground(new Color(240, 240, 240)); // Light gray background
    toolbar.add(categoryComboBox, categoryComboBoxConstraints);

    // Add spacing
    toolbar.add(Box.createVerticalStrut(30));

    // Add the refresh button with improved styling
    // Update the styling for the refresh button
refreshButton.setPreferredSize(new Dimension(150, 40));
refreshButton.setFont(new Font("Arial", Font.BOLD, 16));
refreshButton.setForeground(Color.WHITE);
refreshButton.setBackground(new Color(52, 152, 219));  // Updated color

//n
refreshButton.setOpaque(true);
refreshButton.setBorderPainted(false);

// Add a hover effect with a darker background color
refreshButton.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        refreshButton.setBackground(new Color(99, 81, 185));  // Darker color on hover
    }

    public void mouseExited(java.awt.event.MouseEvent evt) {
        refreshButton.setBackground(new Color(52, 152, 219));  // Original color on exit
    }
});

toolbar.add(refreshButton, refreshButtonConstraints);


    return toolbar;
}




   private void fetchAndDisplayNews() {
        String apiKey = "1f516cb03bae46a59d66b860468f896e";
        String selectedCategory = (String) categoryComboBox.getSelectedItem();
        String categoryKey = getCategoryKey(selectedCategory);

        String newsApiUrl = "https://newsapi.org/v2/top-headlines?country=in&category="+categoryKey+"&apiKey="+apiKey;

        try {
            URL url = new URL(newsApiUrl);                  // url object opens http connection to  news  api 
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");      //The response is read line by line and appended to a StringBuilder.

            int responseCode = connection.getResponseCode();  // getResponseCode() is used to check the HTTP response code.

            
            
            if (responseCode == HttpURLConnection.HTTP_OK) {                        //If the response code is HTTP_OK (200), it reads the response from the API
                try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    StringBuilder response = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }

                    // Parse JSON response
                    JSONObject jsonResponse = new JSONObject(response.toString());   //The response is then converted to a JSONObject using the org.json library.

                    // Check if the response status is "ok"
                    if ("ok".equalsIgnoreCase(jsonResponse.getString("status"))) {                          //Checks if the status in the JSON response is "ok".
                        JSONArray articles = jsonResponse.getJSONArray("articles");                     //Retrieves the array of articles from the JSON response

                        // Build a formatted string with news information
                        StringBuilder newsInfo = new StringBuilder("<html>");

                     
newsInfo.append("<style>")
        .append("body { font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif; line-height: 1.6; margin: 20px; padding: 10px; }")
        .append("h1 { color: #006400; }")
        .append("h2 { color: #333; }")
        .append("b { color: #006400; }")
        .append("a { color: #007BFF; text-decoration: none; font-weight: bold; }")
        .append("hr { border: 0; border-top: 1px solid #eee; margin: 20px 0; }")
        .append(".news-image { width: 50px; height: 50px; object-fit: cover; margin-bottom: 10px; }")
        .append("</style>");




                        newsInfo.append("<h1>Breaking News</h1>");

                        for (int i = 0; i < articles.length(); i++) {
                            JSONObject article = articles.getJSONObject(i);

                            // Extract the image URL
                            String imageUrl = article.optString("urlToImage", "");


// Check if imageUrl is not null or empty before adding the image tag
           if (!imageUrl.isEmpty()) {
        newsInfo.append("<img class='news-image' src='").append(imageUrl).append("' alt='Article Image'>");
    }




                            // Title
                            newsInfo.append("<h2>").append(i + 1).append(". ").append(article.getString("title")).append("</h2>");

                            // Source
                            newsInfo.append("<b>Source:</b> ").append(Objects.requireNonNull(article.getJSONObject("source")).getString("name")).append("<br>");

                            // Author
                            if (!article.isNull("author")) {
                                newsInfo.append("<b>Author:</b> ").append(article.getString("author")).append("<br>");
                            }

                            // Description
                            if (!article.isNull("description")) {
                                newsInfo.append("<b>Description:</b> ").append(article.getString("description")).append("<br>");
                            }

                            // URL
                            String articleUrl = article.getString("url");
                            newsInfo.append("<b>URL:</b> <a href=\"").append(articleUrl).append("\">").append(articleUrl).append("</a><br>");

                            // Published date
                            if (!article.isNull("publishedAt")) {
                                newsInfo.append("<b>Published Date:</b> ").append(article.getString("publishedAt")).append("<br>");
                            }

                            // Add a horizontal line between articles
                            newsInfo.append("<hr>");

                            // Add some spacing between articles
                            newsInfo.append("<br>");
                        }

                        newsInfo.append("</html>");

                        // Update UI with the latest news
                        SwingUtilities.invokeLater(() -> newsEditorPane.setText(newsInfo.toString()));
                    } else {
                        System.out.println("News API returned an error. Status: " + jsonResponse.getString("status"));
                        System.out.println("Error Message: " + jsonResponse.optString("message", "No error message provided."));
                    }
                }
            } else {
                System.out.println("Failed to fetch news. Response Code: " + responseCode);
            }

            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getCategoryKey(String category) {
    switch (category.toUpperCase()) {
        case "ALL":
            return "";
        case "TECHNOLOGY":
            return "technology";
        case "BUSINESS":
            return "business";
        case "SPORTS":
            return "sports";
        case "ENTERTAINMENT":
            return "entertainment";
        case "SCIENCE":
            return "science";
        case "HEALTH":
            return "health";
        case "POLITICS":
            return "politics";
        default:
            return "";
    }
}


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                // Set the look and feel for better UI
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception e) {
                e.printStackTrace();
            }

            Categories app = new Categories();
            app.setVisible(true);
        });
    }
}
