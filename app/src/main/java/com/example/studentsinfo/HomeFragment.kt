import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.studentsinfo.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        button1.setOnClickListener {
            // Handle button1 click event to navigate to ProfileFragment
            // You need to implement the navigation logic here
        }

        button2.setOnClickListener {
            // Handle button2 click event to navigate to ListFragment
            // You need to implement the navigation logic here
        }

        return view
    }
}
