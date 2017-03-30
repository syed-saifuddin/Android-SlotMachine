package com.example.slotmachine;

// 4-sided cube
public class Spinner extends Mesh {
	public Spinner(float width, float height, float depth) {
		width  /= 2;
		height /= 2;
		depth  /= 2*height;

		float vertices[] = {
				-width, -height, -depth, // [0]  point 0  back
				width, -height, -depth, // [1]  point 1
				width,  height, -depth, // [2]  point 2
				-width,  height, -depth, // [3]  point 3

				-width,  height, -depth, // [4]  point 2 top1
				width,  height, -depth, // [5]  point 3
				width,  2*height,  0, // [6]  point 4
				-width,  2*height,  0, // [7]  point 5

				-width,  2*height, 0, // [8]  point 4 top2
				width,  2*height, 0, // [9]  point 5
				width,  height,  depth, // [10]  point 6
				-width,  height,  depth, // [11]  point 7

				-width, height,  depth, // [12]  point 6 front
				width, height,  depth, // [13]  point 7
				width,  -height,  depth, // [14] point 8
				-width,  -height,  depth, // [15] point 9

				-width, -height, depth, // [16] point 8 bottom1
				width, -height, depth, // [17] point 9
				width, -2*height,  0, // [18] point 10
				-width, -2*height,  0, // [19] point 11

				-width, -2*height, 0, // [20] point 10 bottom2
				width, -2*height, 0, // [21] point 11
				width, -height,  -depth, // [1] point 0
				-width, -height,  -depth, // [0] point 1
		};

		short indices[] = {
				0,2,1, 		// back
				0,3,2,
				4,6,5,		// top1
				4,7,6,
				8,10,9,	// top2
				8,11,10,
				12,14,13,	// front
				12,15,14,
				16,18,17,	// bottom1
				16,19,18,
				20,22,21,	//bottom2
				20,23,22,
		};

		// Mapping coordinates for the vertices - this array needs to be same size as vertices array
		float textureCoordinates[] = {
				0.66f, 0.5f,	// vertex [0] back right bottom
				1.0f, 0.5f,	// vertex [1]
				1.0f, 1.0f,	// vertex [2]
				0.66f, 1.0f,	// vertex [3]

				0.66f, 0.0f,	// vertex [4] top	right top
				1.0f, 0.0f, // vertex [5]
				1.0f, 0.5f, // vertex [6]
				0.66f, 0.5f, // vertex [7]

				0.0f, 0.0f, // vertex [8] front	left top
				0.33f, 0.0f, // vertex [9]
				0.33f, 0.5f, // vertex [10]
				0.0f, 0.5f, // vertex [11]

				0.0f, 0.5f, // vertex [12] bottom	left bottom
				0.33f, 0.5f, // vertex [13]
				0.33f, 1.0f, // vertex [14]
				0.0f, 1.0f, // vertex [15]


				0.33f, 0.5f, // vertex [12] bottom	middle bottom
				0.66f, 0.5f, // vertex [13]
				0.66f, 1.0f, // vertex [14]
				0.33f, 1.0f, // vertex [15]

				0.33f, 0.0f, // vertex [8] front	middle top
				0.66f, 0.0f, // vertex [9]
				0.66f, 0.5f, // vertex [10]
				0.33f, 0.5f, // vertex [11]
		};

		setIndices(indices);
		setVertices(vertices);
		setTextureCoordinates(textureCoordinates);
	}
}
