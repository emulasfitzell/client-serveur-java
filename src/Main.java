//Coter client

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



        //coter serveur

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
<<<<<<< HEAD

        /* code ameliorer pour le client pour avoir plusieurs requete ainsi de suite jusqu’à ce qu’on ecrit by et on arrete

        import java.io.BufferedReader;
=======
/* code ameliorer pour le client pour avoir plusieurs requete ainsi de suite jusqu’à ce qu’on ecrit by et on arrete

  import java.io.BufferedReader;
>>>>>>> 623b684 (Ajout initial du code serveur)
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
<<<<<<< HEAD
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
=======
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) {
        int SERVER_PORT = 5000;

        try (ServerSocket server = new ServerSocket(SERVER_PORT)) {
            System.out.println("Le serveur a démarré sur le port " + SERVER_PORT);
            System.out.println("En attente d'une connexion...");

            Socket socket = server.accept();
            System.out.println("Client connecté : " + socket.getInetAddress());

            try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) {

                String clientMessage;
                while ((clientMessage = input.readLine()) != null) {
                    System.out.println("Message reçu du client : " + clientMessage);

                    // Si le client envoie "by", terminer la connexion
                    if ("by".equalsIgnoreCase(clientMessage)) {
                        System.out.println("Le client s'est déconnecté.");
                        break;
                    }

                    // Répondre au client
                    output.println("Message reçu : " + clientMessage);
                }
            }
            socket.close();
>>>>>>> 623b684 (Ajout initial du code serveur)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


<<<<<<< HEAD
             */
=======
  /* serveur qui capitalise les messages(message en Majuscule)

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) {
        int SERVER_PORT = 5000;

        try (ServerSocket server = new ServerSocket(SERVER_PORT)) {
            System.out.println("Le serveur a démarré sur le port " + SERVER_PORT);
            System.out.println("En attente d'une connexion...");

            Socket socket = server.accept();
            System.out.println("Client connecté : " + socket.getInetAddress());

            try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) {

                String clientMessage;
                while ((clientMessage = input.readLine()) != null) {
                    System.out.println("Message reçu du client : " + clientMessage);

                    // Si le client envoie "by", terminer la connexion
                    if ("by".equalsIgnoreCase(clientMessage)) {
                        System.out.println("Le client s'est déconnecté.");
                        break;
                    }

                    // Transformer le message en majuscules
                    String capitalizedMessage = clientMessage.toUpperCase();

                    // Répondre au client avec le message capitalisé
                    output.println(capitalizedMessage);
                }
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




  */
/*   oerations mathematiques

  import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Serveur {
    public static void main(String[] args) {
        int SERVER_PORT = 5000;

        try (ServerSocket server = new ServerSocket(SERVER_PORT)) {
            System.out.println("Le serveur a démarré sur le port " + SERVER_PORT);
            System.out.println("En attente d'une connexion...");

            Socket socket = server.accept();
            System.out.println("Client connecté : " + socket.getInetAddress());

            try (BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true)) {

                String clientMessage;
                while ((clientMessage = input.readLine()) != null) {
                    System.out.println("Opération reçue : " + clientMessage);

                    // Si le client envoie "by", terminer la connexion
                    if ("by".equalsIgnoreCase(clientMessage)) {
                        System.out.println("Le client s'est déconnecté.");
                        break;
                    }

                    // Calculer le résultat de l'opération mathématique
                    String result = evaluateExpression(clientMessage);

                    // Répondre au client
                    output.println(result);
                }
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour évaluer une expression mathématique
    private static String evaluateExpression(String expression) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        try {
            Object result = engine.eval(expression); // Évaluer l'expression
            return result.toString();
        } catch (ScriptException e) {
            return "Erreur : expression invalide";
        }
    }
}


  */




    }
}
