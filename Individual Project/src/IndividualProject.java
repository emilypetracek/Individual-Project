import java.util.ArrayList;
import java.util.Scanner;

public class IndividualProject
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		static ArrayList<Location> places = new ArrayList<Location>();
		static ArrayList<Character> people = new ArrayList<Character>();
		static Character player;
		static Location destination;
		static int pointCounter;
		static boolean play = true;

		public static void main(String[] args)
			{
				setLocations();
				setPeople();
				greetUser();
				while (play = true)
					{
				generateLocation();
				if (places.get(0).getName().equals("France"))
					{
						generateChallengeInFrance();
					}
				if (places.get(1).getName().equals("Brazil"))
					{
						generateChallengeInBrazil();
					}
				if (places.get(2).getName().equals("Egypt"))
					{
						generateChallengeInEgypt();
					}

				else
					{
						generateChallengeInRussia();
					}
					}
			}

		public static void setLocations()
			{
				places.add(new Location("France", 50));
				places.add(new Location("Brazil", 100));
				places.add(new Location("Egypt", 150));
				places.add(new Location("Russia", 200));
			}

		public static void setPeople()
			{
				people.add(new Character("Mary", "Loves adventure, Athlectic, & Speaks many languages",
						"Hates exotic food & Has trouble making decsions", 0));
				people.add(
						new Character("Adriana", "Has great people skills & Has extensive knowledge of other cultures",
								"Slow & Directionally challenged", 0));
				people.add(new Character("Maxim", "Great navigator & Fast",
						"Bad communication skills & Gives up easliy", 0));
			}

		public static void greetUser()
			{
				int counter = 1;
				System.out.println("Hello! Bonjour! Hola! Zdravstvuyte! Guten Tag! Welcome to Travel Adventure!");
				System.out.println();
				System.out.println("First, you must choose your character! Your options are. . .");
				for (int i = 0; i < people.size(); i++)
					{

						System.out.println("Choice " + counter + " " + people.get(i).getName());
						System.out.println("Strengths: " + people.get(i).getStrengths());
						System.out.println("Weaknesses:" + people.get(i).getWeaknesses());
						counter++;
						System.out.println();
					}
				System.out.println(
						"Who do you choose? Please type in the number of who you would like to play. (Example: Type 1 for "
								+ people.get(0).getName() + ")");
				int choosenCharacter = userIntInput.nextInt();
				player = people.get(choosenCharacter - 1);
				System.out.println();
				System.out.println("Nice choice! Welcome " + player.getName() + "!");
				System.out.println(
						"You are in a race around the world! You will be sent to a random location where you will have to complete a challenge in order to gain points!");
				System.out.println("In order to win you MUST earn 300 points or more! Good luck!");
				System.out.println("Press enter to continue in this game and generate your travel destination. . .");
				String space = userStringInput.nextLine();
			}

		public static void generateLocation()
			{
				int randomPlaceNumber = (int) (Math.random() * places.size());
				destination = places.get(randomPlaceNumber);
				System.out.println("Congralutions! You are going to " + destination.getName() + "!");

			}

		public static void generateChallengeInFrance()
			{
				String space = userStringInput.nextLine();
				System.out.println(
						"Bonjour and welcome to France! In this challenge you have the opportunity to gain up to 50 points!");
				System.out.println(
						"You are in the dark cavrens of the catacombs...surrounded by many bones and skulls making an underground maze under Paris... ");
				System.out.println(
						"Your challenge is to make your way through the maze and to earn bonus points while you travel through the maze remember these numbers: 1-2-8-1-8-8-7");
				int bonusNumber = 1281887;
				System.out.println("Press enter to begin maze!");
				String spaceBegin = userStringInput.nextLine();
				System.out.println(
						"To navigate through the maze press R for right and L for left. What is your first move?");
				String playerMove = userStringInput.nextLine();
				if (playerMove.toUpperCase().equals("R"))
					{
						System.out.println(
								"You run for while through the maze until you hit a fork in the path, which way next?");
						String playerMoveOne = userStringInput.nextLine();
						if (playerMoveOne.toUpperCase().equals("R"))
							{
								System.out.println(
										"As you turn the corner, you hear the sound of skulls falling off the walls onto the ground behind you...");
								System.out.println(
										"You don't worry it about it though because this is a game show and the producers would never put you into danger... Right? or Left?");
								String playerMoveTwo = userStringInput.nextLine();
								if (playerMoveTwo.toUpperCase().equals("R"))
									{
										System.out.println(
												"The noise of the skulls stops... that was close! You slow your pace as you see a cross on the wall. Do you go to the right to where the cross is or go left?");
										String playerMoveThree = userStringInput.nextLine();
										if (playerMoveThree.toUpperCase().equals("R"))
											{
												System.out.println(
														"You followed see the cross on the back wall, but you are now in a squared shaped room...");
												System.out.println();
												System.out.println(
														"A trap door quickly slams shuts behind you and you are trapped in the room! Game over!");
												pointCounter = +20;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
										if (playerMoveThree.toUpperCase().equals("L"))
											{
												System.out.println(
														"You briskly walk past a room with the cross hanging on the back wall...");
												System.out.println();
												System.out.println(
														"You walk through a narrow hallway and see light coming out of the end...");
												System.out.println("Press enter to continue. . .");
												String pause = userStringInput.nextLine();
												System.out.println("Congrats! You made it out of the catacombs!!");
												pointCounter = +40;
												System.out.println(
														"Do you remember the numbers from before? If so, type them in now to earn bonus points");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
									}
								if (playerMoveTwo.toUpperCase().equals("L"))
									{
										System.out.println(
												"The noise of the skulls get louder...someone is following you... quickly which way?");
										String playerMoveFour = userStringInput.nextLine();
										if (playerMoveFour.toUpperCase().equals("L"))
											{
												System.out.println(
														"As you turn the corner, you run into the person following you . . .");
												System.out.println(
														"They are dressed in all black and you can only see their eyes. . .");
												System.out.println(
														"But before you are able to do anything, you hear the last skull drop: it is yours. . .");
												System.out.println("You are knocked out! Game over!");
												pointCounter = +10;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
										if (playerMoveFour.toUpperCase().equals("R"))
											{
												System.out.println(
														"You make a right and find a stairway. Light taunts you from the top of the staircase. . .");
												System.out.println(
														"You run up the stairs as fast as your legs will let you and make it to the top. . .");
												System.out.println(
														"You escaped your stocker and navigated successfully through the catacombs!");
												pointCounter = +40;
												System.out.println(
														"Do you remember the numbers from before? If so, type them in now to earn bonus points");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
									}
							}
						if (playerMoveOne.toUpperCase().equals("L"))
							{
								System.out.println(
										"You run to the left for awhile to the left until you hear a noise coming from somewhere nearby.");
								System.out.println(
										"You don't worry though because everyone here is supposed to be dead. . . right? Left?");
								String playerMoveFive = userStringInput.nextLine();
								if (playerMoveFive.toUpperCase().equals("L"))
									{
										System.out.println("The noise is gettting louder. . . quickly which way?");
										String playerMoveSix = userStringInput.nextLine();
										if (playerMoveSix.toUpperCase().equals("L"))
											{
												System.out.println(
														"You enter a part of the catacombs where people are buried. . .");
												System.out.println(
														"One of the bodies draped in cloth starts shaking. . .");
												System.out.println(
														"That was the noise. You back away slowly, but it is too late.");
												System.out.println(
														"You have come face to face with a zombie! Game over!");
												pointCounter = +10;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
										if (playerMoveSix.toUpperCase().equals("R"))
											{
												System.out.println(
														"You move to the right a discover a ladder. You hands are shaking, but you make it up.");
												System.out.println(
														"You see the light! You have made it out of the catacombs! Great job!");
												pointCounter = +40;
												System.out.println(
														"Do you remember the numbers from before? If so, type them in now to earn bonus points");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
									}
								if (playerMoveFive.toUpperCase().equals("R"))
									{
										System.out.println(
												"The noise fades away, but you have a choice. You can either go the right and enter a large hall, or go to the left and enter a tight tunnel that you will have to get on your hands and knees to crawl through.");
										System.out.println("What's your choice?");
										String playerMoveSeven = userStringInput.nextLine();
										if (playerMoveSeven.toUpperCase().equals("R"))
											{
												System.out.println(
														"You have entered the large hall. Nothing looks suspicuous here.");
												System.out.println(
														"But out of no where, you fall through a trap door underneath you to your doom! Game over!");
												pointCounter = +5;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
										if (playerMoveSeven.toUpperCase().equals("L"))
											{
												System.out.println(
														"You starting crawling through the tight tunnel and get stuck twice.");
												System.out.println(
														"A light shines at the end, but you feel one of the dogs, roaming around down here, bit onto your pant leg. . .");
												System.out.println(
														"The dog drags you back into the catacombs! Game over! ");
												pointCounter = +5;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
									}

							}
					}

				if (playerMove.toUpperCase().equals("L"))
					{
						System.out.println(
								"You run to the left for awhile and then come upon a split in your path. Where do you choose to go next?");
						String playerMoveEight = userStringInput.nextLine();
						if (playerMoveEight.toUpperCase().equals("R"))
							{
								System.out.println(
										"As you turn the corner, you hear the sound of skulls falling off the walls onto the ground behind you...");
								System.out.println(
										"You don't worry it about it though because this is a game show and the producers would never put you into danger... Right? or Left?");
								String playerMoveNine = userStringInput.nextLine();
								if (playerMoveNine.toUpperCase().equals("R"))
									{
										System.out.println(
												"The noise of the skulls stops... that was close! You slow your pace as you see a cross on the wall. Do you go to the right to where the cross is or go left?");
										String playerMoveTen = userStringInput.nextLine();
										if (playerMoveTen.toUpperCase().equals("R"))
											{
												System.out.println(
														"You followed see the cross on the back wall, but you are now in a squared shaped room...");
												System.out.println();
												System.out.println(
														"A trap door quickly slams shuts behind you and you are trapped in the room! Game over!");
												pointCounter = +20;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
										if (playerMoveTen.toUpperCase().equals("L"))
											{
												System.out.println(
														"You briskly walk past a room with the cross hanging on the back wall...");
												System.out.println();
												System.out.println(
														"You walk through a narrow hallway and see light coming out of the end...");
												System.out.println("Press enter to continue. . .");
												String pause = userStringInput.nextLine();
												System.out.println("Congrats! You made it out of the catacombs!!");
												pointCounter = +40;
												System.out.println(
														"Do you remember the numbers from before? If so, type them in now to earn bonus points");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
									}
								if (playerMoveNine.toUpperCase().equals("L"))
									{
										System.out.println(
												"The noise of the skulls get louder...someone is following you... quickly which way?");
										String playerMoveEleven = userStringInput.nextLine();
										if (playerMoveEleven.toUpperCase().equals("L"))
											{
												System.out.println(
														"As you turn the corner, you run into the person following you . . .");
												System.out.println(
														"They are dressed in all black and you can only see their eyes. . .");
												System.out.println(
														"But before you are able to do anything, you hear the last skull drop: it is yours. . .");
												System.out.println("You are knocked out! Game over!");
												pointCounter = +10;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
										if (playerMoveEleven.toUpperCase().equals("R"))
											{
												System.out.println(
														"You make a right and find a stairway. Light taunts you from the top of the staircase. . .");
												System.out.println(
														"You run up the stairs as fast as your legs will let you and make it to the top. . .");
												System.out.println(
														"You escaped your stocker and navigated successfully through the catacombs!");
												pointCounter = +40;
												System.out.println(
														"Do you remember the numbers from before? If so, type them in now to earn bonus points");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
									}
							}
						if (playerMoveEight.toUpperCase().equals("L"))
							{
								System.out.println(
										"You run to the left for awhile to the left until you hear a noise coming from somewhere nearby.");
								System.out.println(
										"You don't worry though because everyone here is supposed to be dead. . . right? Left?");
								String playerMoveTweleve = userStringInput.nextLine();
								if (playerMoveTweleve.toUpperCase().equals("L"))
									{
										System.out.println("The noise is gettting louder. . . quickly which way?");
										String playerMoveThirteen = userStringInput.nextLine();
										if (playerMoveThirteen.toUpperCase().equals("L"))
											{
												System.out.println(
														"You enter a part of the catacombs where people are buried. . .");
												System.out.println(
														"One of the bodies draped in cloth starts shaking. . .");
												System.out.println(
														"That was the noise. You back away slowly, but it is too late.");
												System.out.println(
														"You have come face to face with a zombie! Game over!");
												pointCounter = +10;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
										if (playerMoveThirteen.toUpperCase().equals("R"))
											{
												System.out.println(
														"You move to the right a discover a ladder. You hands are shaking, but you make it up.");
												System.out.println(
														"You see the light! You have made it out of the catacombs! Great job!");
												pointCounter = +40;
												System.out.println(
														"Do you remember the numbers from before? If so, type them in now to earn bonus points");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
									}
								if (playerMoveTweleve.toUpperCase().equals("R"))
									{
										System.out.println(
												"The noise fades away, but you have a choice. You can either go the right and enter a large hall, or go to the left and enter a tight tunnel that you will have to get on your hands and knees to crawl through.");
										System.out.println("What's your choice?");
										String playerMoveFourteen = userStringInput.nextLine();
										if (playerMoveFourteen.toUpperCase().equals("R"))
											{
												System.out.println(
														"You have entered the large hall. Nothing looks suspicuous here.");
												System.out.println(
														"But out of no where, you fall through a trap door underneath you to your doom! Game over!");
												pointCounter = +5;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
										if (playerMoveFourteen.toUpperCase().equals("L"))
											{
												System.out.println(
														"You starting crawling through the tight tunnel and get stuck twice.");
												System.out.println(
														"A light shines at the end, but you feel one of the dogs, roaming around down here, bit onto your pant leg. . .");
												System.out.println(
														"The dog drags you back into the catacombs! Game over! ");
												pointCounter = +5;
												System.out.println(
														"Do you remember the number from the beginning? If so, type it in now to gain extra points!");
												int bonusPoints = userIntInput.nextInt();
												if (bonusPoints == bonusNumber)
													{
														player.setPoints(pointCounter + 10);
														System.out.println(
																"You are correct you get 10 extra bonus points! Your new point total is "
																		+ player.getPoints());
													} else
													{
														player.setPoints(pointCounter);
														System.out.println(
																"Sorry, you are incorrect. Your new point total is "
																		+ player.getPoints());
													}
											}
									}
							}
					}
			}

		public static void generateChallengeInEgypt()
			{

			}

		public static void generateChallengeInBrazil()
			{

			}

		public static void generateChallengeInRussia()
			{

			}

	}
