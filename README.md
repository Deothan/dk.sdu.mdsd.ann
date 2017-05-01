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
			size 4
			learningRule SecretFunction external
		}

		hidden {
			size 4
			learningRule StrongFunction external
		}

		hidden {
			size 3
			learningRule myFunc(x) {
				function = 5.0 + 5.0
				derivative = (5.0-6.0)/8.0*(4.0+4.0)
			}
		}

		out {
			size 1
			learningRule sigmoid
		}
	}
}
