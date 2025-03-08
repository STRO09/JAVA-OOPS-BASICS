package iteration;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_main {
	public static void main(String[] args) {
		LinkedList<String> distros = new LinkedList<String>(List.of("TempleOS", "OpenBSD", "ArchLinux", "Fedora"));

		ListIterator<String> listIterator = distros.listIterator();

		System.out.println("DISTROS:");
		while (listIterator.hasNext()) {
			String distro = (String) listIterator.next();
			if (distro == "ArchLinux") {
				listIterator.remove();
				listIterator.add("KaliLinux");
//			listIterator.set(distro);
			}

			System.out.println(distro);
		}

		System.out.println("DISTROS IN REVERSE ORDER after operations:");
		while (listIterator.hasPrevious()) {
			String distro = listIterator.previous();
			System.out.println(distro);
		}

		System.out.println("DISTROS AFTER OPERATIONS: ");
		listIterator = distros.listIterator();

		while (listIterator.hasNext()) {
			String distro = (String) listIterator.next();
			listIterator.set("Some popular distro");
			System.out.println(distro);
		}

		System.out.println("DISTROS AFTER update: ");
		listIterator = distros.listIterator();

		while (listIterator.hasNext()) {
			String distro = (String) listIterator.next();
			listIterator.set("Some popular distro");
			System.out.println(distro);
		}

	}
}
