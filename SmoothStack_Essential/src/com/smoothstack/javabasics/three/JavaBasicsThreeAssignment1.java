/**
 * 
 */
package com.smoothstack.javabasics.three;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author dhrubo
 * 
 * Get a list of all file/directory names (including in subdirectories) under a given directory
 *
 */
public class JavaBasicsThreeAssignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Path path = Paths.get("/Users/dhrubo/Desktop/SmoothStack/SmoothStack_Essential/src/resources");
		
		// auto close the stream
		try (Stream<Path> subPaths = Files.walk(path, 2)) {
			
			subPaths.forEach(name -> System.out.println(name));
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File Does Not Exist!");
		}

	}

}
