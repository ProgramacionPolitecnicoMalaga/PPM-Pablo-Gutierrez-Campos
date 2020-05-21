package Servlet;

import Modelo.Promedio;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class numerosServlet {
    @WebServlet(
            name = "Numeros",
            urlPatterns = {"/numeros"}
    )

    public class AñosDeVidaServlet extends HttpServlet {

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            Promedio promedio = new Promedio();
            ArrayList<Integer> numeros =  new ArrayList<>();
            String resultadoJson ="";
            String recibidoJson=req.getReader().lines().collect(Collectors.joining());
            JSONParser jsonParser = new JSONParser();
            try {
                JSONObject json = (JSONObject) jsonParser.parse(recibidoJson);
                int numero1 = (int) json.get("numeros1");
                int numero2 = (int) json.get("numeros2");
                int numero3 = (int) json.get("numeros3");
                numeros.add(numero1);
                numeros.add(numero2);
                numeros.add(numero3);
                int promedios = promedio.promedio(numeros);

                resultadoJson = "{\"status\":\"ok\",\"numeros\":\""+ numero1 +"\",\"numeros\":\""+numero2 + "\",\"numeros\":\""+numero3+"\"}";
            } catch (Exception e) {
                 resultadoJson = "{\"status\":\"ko\"}";
                e.printStackTrace();
            }
            PrintWriter out = resp.getWriter();
            resp.setContentType("application/json");
            out.print(resultadoJson);
        }
    }
}
