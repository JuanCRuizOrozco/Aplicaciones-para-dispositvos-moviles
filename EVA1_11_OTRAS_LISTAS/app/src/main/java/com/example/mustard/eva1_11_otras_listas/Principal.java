package com.example.mustard.eva1_11_otras_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import static android.widget.ListView.*;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstVwTitu;
    TextView txtVwMuestra;
    final  String [] sObras = {
            "Bovedas de Acero",
            "Yo, Robot",
            "Fundacion y Tierra",
            "20 mi leguas de viaje en Submarino",
            "La guerra de los mundos",
            "Blade runner",
            "Los juegos de ender"
    };
     final String [] sReseñas = {
            "La acción se desarrolla en la Tierra, durante el siglo XLVII, donde las ciudades están encapsuladas en gigantescas bóvedas de acero (de las que la novela toma su nombre) y sin contacto directo con el mundo exterior. Los terrestres, una vez colonizadores de casi 50 planetas, han abandonado ya esta empresa, se han vuelto agorafóbicos y rechazan las innovaciones tecnológicas, como los robots. Los habitantes de los restantes planetas, los espacianos o espaciales (spacers en inglés), han desarrollado en cambio su cultura con base en las más avanzadas tecnologías, entre las que se destacan los robots de cerebro positrónico, a los que han logrado dar forma asombrosamente humana. Los espacianos colonizaron los últimos 20 de los 50 planetas habitados en aquella época. ",
            "Yo, robot es una colección de relatos en los que se establecen y plantean los problemas de las tres leyes de la robótica que son un compendio fijo e imprescindible de moral aplicable a supuestos robots inteligentes. Los relatos plantean diferentes situaciones a las que tendrán que enfrentarse distintos especialistas en robótica y en las que se plantean paradojas e ingeniosos ejercicios intelectuales que indagan sobre la situación del hombre actual en el universo tecnológico. La protagonista de varias de las historias es Susan Calvin, experta en robopsicología. ",
            "El concejal Golan Trevize, el historiador Janov Pelorat y Bliss del planeta Gaia (todos se conocieron en el libro Los límites de la Fundación) inician un viaje en el que quieren encontrar el planeta en el que empezó la especie humana, la Tierra. El propósito del viaje es resolver la duda que Trevize mantiene acerca de la decisión que tuvo que tomar en la historia anterior de la serie, Los límites de la Fundación. ",
            "Veinte mil leguas de viaje submarino es una obra narrada en primera persona por el profesor francés Pierre Aronnax, notable biólogo que es hecho prisionero por el Capitán Nemo y es conducido por los océanos a bordo del submarino Nautilus, en compañía de su criado Consejo y el arponero canadiense Ned Land. ",
            "La historia de la novela es relatada por un narrador sin nombre en 1904, tras seis años de la invasión marciana, y comienza con una cita de Johannes Kepler, seguida por una introducción dada por el protagonista, un escritor de artículos de ciencia especulativa (cuyo nombre nunca es mencionado), en la visita a un observatorio en Ottershaw por la invitación de un \"notable astrónomo\" llamado Ogilvy. Allí son testigos de una explosión en la superficie del planeta Marte, parte de una serie de sucesos de ese tipo que despiertan mucho interés en la comunidad científica. Días después, lo que se cree un \"meteoro\" aterriza en el campo comunal de Horsell, cerca de Londres. El narrador tiene su hogar cerca, y él es uno de los primeros en descubrir que el objeto es un cilindro artificial lanzado desde Marte.",
            "La acción se sitúa en un mundo lleno de polvo radiactivo después de una guerra nuclear que terminó matando a la mayoría de los animales, esto lleva a que la gente tenga animales eléctricos. El protagonista es Rick Deckard, un expolicía y experto cazador de androides renegados, tarea a la que él mismo se refiere como retirar. En la historia tendrá que retirar a un grupo de androides de última generación, modelo denominado Nexus 6, que tienen como peculiaridad ser casi idénticos a seres humanos, que han llegado hasta la Tierra huyendo desde una colonia espacial debido a las terribles condiciones a las que estaban sometidos. ",
            "El juego de Ender (título original Ender's Game, 1985) es la novela más conocida de Orson Scott Card. Obtuvo los dos premios más prestigiosos de la ciencia ficción: el premio Nébula a la mejor novela en 1985 y el premio Hugo a la mejor novela en 1986. La novela se originó como un cuento de ciencia ficción en la revista Analog (1977), cuento que recibió el premio Ignotus de 1994, así como sendas nominaciones al Hugo y Locus de 1978. Está ambientada en un futuro donde la humanidad se enfrenta al exterminio a manos de una agresiva sociedad extraterrestre conocida como los \"insectores\" (buggers en el original). Andrew 'Ender' Wiggin es reclutado a la edad de seis años para ser adiestrado en la Escuela de Batalla, una estación espacial donde niños superdotados son preparados desde su infancia para dirigir la próxima guerra. El juego de Ender es el primero de un grupo de cinco libros conocidos como la Saga de Ender. En 1999 Card comenzó una serie de novelas paralela a la acción descrita en la Saga de Ender, la Saga de las Sombras, que se compone de otros cinco libros. La primera de estas novelas fue La Sombra de Ender. "
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lstVwTitu= findViewById(R.id.lstVwTitu);
        txtVwMuestra= findViewById(R.id.txtVwMuestra);
        lstVwTitu.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sObras));
        lstVwTitu.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtVwMuestra.setText(sReseñas[position]);
    }
}
