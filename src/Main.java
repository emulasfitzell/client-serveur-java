import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Main {
    public static void main(String[] toto)
    {
        int SERVER_PORT = 5000;
        try {
            ServerSocket server = new ServerSocket(SERVER_PORT);
            System.out.println("Le serveur a démarré sur le port " + SERVER_PORT);
            //Le serveur attend la connexion ou requette du client | Le serveur est en attente de la connexion du client
            //Il est appliqué sur une instance du ServerSocket
            Socket socket = server.accept();
//           InputStreamReader isr = new InputStreamReader(socket.getInputStream());
//           En cas d'occupation du port par un autre serveur .Pour le tuer On tape :
            //Pour lister les proc sur le port (proc = processus)
//           netstat -ano | findstr le port
            //Pour tuer le proc
//           taskill /pid numero de proc /F
            //A optimiser
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader input = new BufferedReader(isr);

            String message = input.readLine();
            System.out.println("Message reçu : " + message);
            socket.close();

        } catch (IOException exception) {
            exception.printStackTrace();
        }

        /* code ameliorer pour le client pour avoir plusieurs requete ainsi de suite jusqu’à ce qu’on ecrit by et on arrete

        import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String SERVER_HOST = "localhost"; // Adresse IP ou nom d'hôte du serveur
        int SERVER_PORT = 5000;

        try (Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
             PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connecté au serveur sur " + SERVER_HOST + ":" + SERVER_PORT);

            String userMessage;
            while (true) {
                // Lire l'entrée utilisateur depuis la console
                System.out.print("Entrez un message (écrivez 'by' pour quitter) : ");
                userMessage = console.readLine();

                // Envoyer le message au serveur
                output.println(userMessage);

                // Vérifier si l'utilisateur a demandé de terminer
                if ("by".equalsIgnoreCase(userMessage)) {
                    System.out.println("Déconnexion du serveur...");
                    break;
                }

                // Lire la réponse du serveur
                String serverResponse = input.readLine();
                System.out.println("Réponse du serveur : " + serverResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
        */
        /* operations Mathematiques

            import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String SERVER_HOST = "localhost"; // Adresse IP ou nom d'hôte du serveur
        int SERVER_PORT = 5000;

        try (Socket socket = new Socket(SERVER_HOST, SERVER_PORT);
             PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             BufferedReader console = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Connecté au serveur sur " + SERVER_HOST + ":" + SERVER_PORT);

            String userMessage;
            while (true) {
                // Lire l'entrée utilisateur depuis la console
                System.out.print("Entrez une opération mathématique (ou 'by' pour quitter) : ");
                userMessage = console.readLine();

                // Envoyer l'opération au serveur
                output.println(userMessage);

                // Vérifier si l'utilisateur a demandé de terminer
                if ("by".equalsIgnoreCase(userMessage)) {
                    System.out.println("Déconnexion du serveur...");
                    break;
                }

                // Lire la réponse du serveur
                String serverResponse = input.readLine();
                System.out.println("Résultat : " + serverResponse);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


             */

    }
}