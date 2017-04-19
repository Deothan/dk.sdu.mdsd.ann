## DSL
An example of the DSL is given below-

	Network {
		alpha 0.005
		epochs 150

		in {
			size 10
		}

		hidden {
			size 6
			learningRule sigmoid
		}

		hidden {
			size 3
			learningRule myFunc {
				test
			}
		}

		out {
			size 1
			learningRule sigmoid
		}
	}
