package ougcv1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

abstract class Reader {
	abstract void read() throws IOException;
}

class FileReader extends Reader {
	void read() throws FileNotFoundException {

	}
}

class NetWorkReader extends Reader {
	void read() throws MalformedURLException {

	}
}

public class CheckedExceptions {

	public static void main(String[] args) {

	}

}
