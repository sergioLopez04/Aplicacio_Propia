package com.example.aplicacio_propia.Utilidades;

import com.example.aplicacio_propia.Modelos.Recetas;
import com.example.aplicacio_propia.R;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static final String NOMBRE_RECE = "NOMBRE_RECE";
    public static final String IMAGEN_RECE = "IMAGEN_RECE";
    public static final String INGRED_RECE = "INGRED_RECE";
    public static final String DESCRI_RECE = "DESCRI_RECE";


    private static List<Recetas> lista;

    public static List<Recetas> getListaRecetas() {
        if (lista == null) {
            lista = new ArrayList<>();

            lista.add(new Recetas(R.drawable.tortillapatatas, "Tortilla de Patatas", "1. Preparar las patatas: Pela las patatas y córtalas en rodajas finas o en trozos pequeños, según prefieras. Si usas cebolla, pícala en trozos pequeños.\n \n 2. Freír las patatas y la cebolla: En una sartén grande, calienta abundante aceite de oliva. Añade las patatas y la cebolla (si la usas) y cocínalas a fuego medio, removiendo de vez en cuando, hasta que estén tiernas pero no doradas.\n \n 3. Escurrir el exceso de aceite: Saca las patatas y la cebolla de la sartén y escúrrelas bien para retirar el exceso de aceite.\n \n 4. Preparar la mezcla con huevo: En un bol grande, bate los huevos.", " 4 patatas medianas \n 1 cebolla (opcional) \n 5 huevos \n Aceite de oliva virgen extra \n Sal"));
            lista.add(new Recetas(R.drawable.paellavalenciana, "Paella Valenciana", "1. Sofreír las carnes: Dora el pollo y el conejo en una paellera con aceite. \n\n 2. Añadir las verduras: Incorpora las judías verdes y el tomate triturado y sofríe todo junto.\n\n 3. Agregar el arroz y especias: Añade el arroz, el pimentón y el azafrán.\n\n 4. Cocinar: Vierte el caldo caliente y cocina hasta que el arroz esté en su punto.", " 500 g de arroz\n 1 pollo troceado\n 1 conejo troceado\n 200 g de judías verdes\n 1 tomate triturado\n Pimentón, azafrán, aceite de oliva, caldo, sal"));
            lista.add(new Recetas(R.drawable.gazpacho, "Gazpacho Andaluz", "1. Preparar los ingredientes: Lava los tomates, corta el pepino y el pimiento, y pela el ajo.\n\n 2. Triturar: Coloca todo en una batidora junto con el pan remojado, el aceite, el vinagre y la sal.\n\n 3. Enfriar: Refrigera el gazpacho durante unas horas antes de servirlo bien frío.", " 6 tomates maduros\n 1 pepino\n 1 pimiento verde\n 1 diente de ajo\n Aceite de oliva, vinagre, pan del día anterior, sal"));
            lista.add(new Recetas(R.drawable.croquetas, "Croquetas de Jamón", "1. Hacer la bechamel: Derrite la mantequilla, añade la harina y cocina unos minutos. Vierte la leche poco a poco, sin dejar de remover.\n\n 2. Incorporar el jamón: Añade el jamón y condimenta con sal, pimienta y nuez moscada.\n\n 3. Formar las croquetas: Deja enfriar la masa, forma las croquetas y empánalas.\n\n 4. Freír: Cocina las croquetas en aceite caliente hasta que estén doradas.", " 100 g de jamón serrano\n 50 g de mantequilla\n 50 g de harina\n 500 ml de leche\n Nuez moscada, sal, pimienta, pan rallado, huevo batido"));
            lista.add(new Recetas(R.drawable.flan, "Flan de Huevo", "1. Mezclar: Bate los huevos con el azúcar y la vainilla.\n\n 2. Calentar: Añade la leche caliente y mezcla bien.\n\n 3. Caramelizar: Vierte caramelo líquido en un molde y añade la mezcla.\n\n 4. Cocinar: Cocina al baño maría en el horno a 180°C durante 45 minutos.", " 4 huevos\n 500 ml de leche\n 150 g de azúcar\n 1 cucharadita de vainilla\n Caramelo líquido"));
            lista.add(new Recetas(R.drawable.pulpo, "Pulpo a la Gallega", "1. Cocinar el pulpo: Hierve el pulpo en agua con sal hasta que esté tierno.\n\n 2. Cortar y emplatar: Corta en rodajas y coloca sobre una base de patatas cocidas.\n\n 3. Aliñar: Espolvorea con pimentón, sal gruesa y un chorrito de aceite de oliva.", " 1 pulpo\n Patatas\n Aceite de oliva\n Pimentón\n Sal gruesa"));
            lista.add(new Recetas(R.drawable.pimientos, "Pimientos Rellenos", "1. Preparar los pimientos: Vacía los pimientos y límpialos.\n\n 2. Hacer el relleno: Cocina carne picada con cebolla, tomate y especias.\n\n 3. Rellenar: Llena los pimientos con la mezcla y hornéalos a 180°C durante 40 minutos.", " Pimientos grandes\n 300 g de carne picada\n 1 cebolla\n 1 tomate\n Aceite de oliva, sal, pimienta"));
            lista.add(new Recetas(R.drawable.callos, "Callos a la Madrileña", "1. Cocinar los callos: Cuece los callos con agua, sal y laurel hasta que estén tiernos.\n\n 2. Preparar la salsa: Sofríe ajo, cebolla y pimentón. Añade chorizo y morcilla.\n\n 3. Mezclar: Incorpora los callos a la salsa y cocina a fuego lento.", " 1 kg de callos\n 1 chorizo\n 1 morcilla\n 1 cebolla\n Pimentón, ajo, laurel, sal"));
            lista.add(new Recetas(R.drawable.churros, "Churros", "1. Preparar la masa: Mezcla agua caliente con harina y sal.\n\n 2. Formar los churros: Coloca la masa en una churrera o manga pastelera.\n\n 3. Freír: Cocina en abundante aceite caliente hasta dorarlos.\n\n 4. Servir: Espolvorea con azúcar y acompaña con chocolate caliente.", " 250 g de harina\n 250 ml de agua\n Aceite de oliva\n Sal, azúcar"));
            lista.add(new Recetas(R.drawable.ensaladilla, "Ensaladilla Rusa", "1. Cocer los ingredientes: Hierve patatas, zanahorias y guisantes. Añade atún y huevo duro.\n\n 2. Mezclar: Combina con mayonesa y ajusta de sal.\n\n 3. Servir: Refrigera antes de servir.", " 4 patatas\n 2 zanahorias\n 100 g de guisantes\n 2 huevos duros\n 1 lata de atún\n Mayonesa, sal"));




        }
        return lista;

    }



    public static void borrarReceta(int itemID) {
        List<Recetas> recetas = getListaRecetas();
        for (int i = 0; i < recetas.size(); i++) {
            if (recetas.get(i).getIdImagen() == itemID) {
                recetas.remove(i);
                break;
            }
        }
    }


}

