INSERT INTO Fields (name, description) VALUES
                                           ('Jardinage', 'Apprenez les bases du jardinage, de la culture des plantes et de l’entretien des espaces verts.'),
                                           ('Yoga', 'Explorez des pratiques de yoga pour améliorer la flexibilité, la force et la paix intérieure.'),
                                           ('Finance', 'Comprenez les concepts financiers, y compris la gestion d’argent, les investissements et l’épargne.'),
                                           ('Technologie', 'Découvrez les avancées technologiques et les outils innovants du monde numérique.'),
                                           ('Cuisine', 'Maîtrisez l’art de la cuisine avec des recettes et techniques culinaires variées.'),
                                           ('Sport', 'Apprenez et pratiquez des activités sportives pour améliorer votre condition physique.'),
                                           ('Mathématiques', 'Explorez les concepts mathématiques allant de l’arithmétique de base aux calculs avancés.'),
                                           ('Astronomie', 'Découvrez les mystères de l’univers, des étoiles aux galaxies et au-delà.');

INSERT INTO Courses (name, content, field_id) VALUES
                                                  -- Jardinage (Field ID 1)
                                                  ('Introduction au Jardinage', 'Découvrez les bases du jardinage pour débutants.', 1),
                                                  ('Plantes d’Intérieur', 'Apprenez à cultiver et entretenir des plantes d’intérieur.', 1),
                                                  ('Potager Urbain', 'Créez un potager dans un petit espace urbain.', 1),

                                                  -- Yoga (Field ID 2)
                                                  ('Yoga pour Débutants', 'Initiez-vous aux postures de base et à la respiration.', 2),
                                                  ('Yoga Dynamique', 'Améliorez votre endurance avec des enchaînements dynamiques.', 2),
                                                  ('Méditation et Yoga', 'Apprenez à méditer pour une meilleure santé mentale.', 2),

                                                  -- Finance (Field ID 3)
                                                  ('Gestion de Budget Personnel', 'Apprenez à gérer vos finances personnelles efficacement.', 3),
                                                  ('Introduction à l’Investissement', 'Découvrez les bases des investissements financiers.', 3),
                                                  ('Comprendre les Cryptomonnaies', 'Explorez les principes des monnaies numériques.', 3),

                                                  -- Technologie (Field ID 4)
                                                  ('Introduction à la Programmation', 'Apprenez les bases de la programmation avec Python.', 4),
                                                  ('Découverte de l’IA', 'Comprenez comment fonctionne l’intelligence artificielle.', 4),
                                                  ('Sécurité Informatique', 'Protégez vos données avec des bonnes pratiques de sécurité.', 4),

                                                  -- Cuisine (Field ID 5)
                                                  ('Techniques de Base en Cuisine', 'Maîtrisez les bases de la cuisine pour débutants.', 5),
                                                  ('Cuisine Italienne', 'Apprenez à préparer des plats italiens classiques.', 5),
                                                  ('Pâtisserie pour Débutants', 'Découvrez les bases de la pâtisserie.', 5),

                                                  -- Sport (Field ID 6)
                                                  ('Course à Pied pour Débutants', 'Initiez-vous à la course à pied avec un plan progressif.', 6),
                                                  ('Musculation à la Maison', 'Découvrez des exercices simples à faire chez vous.', 6),
                                                  ('Yoga pour les Sportifs', 'Étirez vos muscles et améliorez votre souplesse.', 6),

                                                  -- Mathématiques (Field ID 7)
                                                  ('Mathématiques de Base', 'Reprenez les fondamentaux de l’arithmétique.', 7),
                                                  ('Introduction à l’Algèbre', 'Comprenez les bases des équations et des fonctions.', 7),
                                                  ('Statistiques pour Débutants', 'Apprenez à analyser des données avec des statistiques simples.', 7),

                                                  -- Astronomie (Field ID 8)
                                                  ('Les Bases de l’Astronomie', 'Découvrez les concepts fondamentaux de l’astronomie.', 8),
                                                  ('Exploration du Système Solaire', 'Apprenez les caractéristiques des planètes de notre système.', 8),
                                                  ('Introduction à l’Astrophysique', 'Explorez les forces et phénomènes qui régissent l’univers.', 8);

INSERT INTO Cards (title, content, img, course_id) VALUES
                                                       -- Cards pour "Introduction au Jardinage"
                                                       ('Comprendre les Bases du Sol', 'Découvrez les types de sols (argileux, sableux, limoneux), leur rôle et comment améliorer leur fertilité avec des amendements naturels comme le compost.', NULL, 1),
                                                       ('Les Outils Essentiels du Jardinier', 'Apprenez à utiliser et entretenir les outils de base comme la bêche, le sécateur, et l’arrosoir pour maximiser leur efficacité.', NULL, 1),
                                                       ('Choisir les Plantes Adaptées', 'Explorez comment sélectionner des plantes adaptées à votre climat et type de sol pour un jardinage réussi.', NULL, 1),
                                                       ('Planification de Votre Jardin', 'Maîtrisez l’art de planifier l’espace pour optimiser la lumière, la rotation des cultures et la gestion de l’eau.', NULL, 1),
                                                       ('Les Bases de l’Arrosage', 'Découvrez comment arroser vos plantes efficacement en fonction de leur besoin en eau pour éviter le sur-arrosage.', NULL, 1),

                                                       -- Cards pour "Création d’un Potager"
                                                       ('Préparer un Espace pour un Potager', 'Apprenez à choisir un emplacement avec un bon ensoleillement et à préparer la terre pour des cultures saines.', NULL, 2),
                                                       ('Les Légumes Faciles pour Débutants', 'Découvrez les légumes faciles à cultiver comme les tomates, radis, ou salades pour commencer votre potager.', NULL, 2),
                                                       ('Les Méthodes de Culture Bio', 'Comprenez les techniques de jardinage biologique, comme la rotation des cultures et le compostage.', NULL, 2),
                                                       ('Les Associations de Plantes', 'Découvrez les plantes qui se protègent et se renforcent mutuellement pour optimiser vos récoltes.', NULL, 2),
                                                       ('Protéger Votre Potager', 'Apprenez à protéger vos légumes des ravageurs avec des solutions naturelles comme les purins d’ortie.', NULL, 2),

                                                       -- Cards pour "Entretien du Jardin"
                                                       ('Techniques de Taille des Plantes', 'Maîtrisez la taille des arbustes, des rosiers, et autres plantes pour stimuler leur croissance.', NULL, 3),
                                                       ('Lutte Contre les Mauvaises Herbes', 'Découvrez les techniques pour désherber efficacement et prévenir leur retour avec du paillage.', NULL, 3),
                                                       ('Gestion de l’Eau au Jardin', 'Apprenez à économiser l’eau avec des systèmes de récupération et d’irrigation goutte-à-goutte.', NULL, 3),
                                                       ('Fertilisation Naturelle', 'Utilisez des engrais naturels comme le compost, le fumier ou les algues pour nourrir vos plantes.', NULL, 3),
                                                       ('Préparation du Jardin en Hiver', 'Protégez vos plantes et préparez votre jardin pour l’hiver avec des voiles d’hivernage et du paillage.', NULL, 3),

                                                       -- Cards pour "Jardinage en Intérieur"
                                                       ('Choisir les Plantes d’Intérieur', 'Identifiez les plantes d’intérieur adaptées à la lumière et à l’humidité de votre maison.', NULL, 2),
                                                       ('Entretien des Plantes d’Intérieur', 'Apprenez à arroser, fertiliser et rempoter vos plantes pour leur offrir les meilleures conditions.', NULL, 2),
                                                       ('Créer un Mur Végétal', 'Explorez les techniques pour concevoir un mur végétal esthétique et fonctionnel.', NULL, 2),
                                                       ('Les Plantes Dépolluantes', 'Découvrez des plantes comme le ficus ou le lierre qui améliorent la qualité de l’air de votre intérieur.', NULL, 2),
                                                       ('Lutter Contre les Parasites en Intérieur', 'Apprenez à identifier et éliminer les parasites courants des plantes d’intérieur comme les cochenilles ou les pucerons.', NULL, 2),
                                                       -- Cartes pour "Yoga pour Débutants" (Course ID 4)
                                                       ('Introduction au Yoga pour Débutants', 'Le yoga est une pratique ancienne qui combine des exercices physiques, des techniques de respiration et de méditation pour améliorer la flexibilité, la force et la paix intérieure. Ce cours pour débutants vous guide à travers les postures de base du yoga, vous aidant à améliorer votre bien-être physique et mental.', NULL, 4),
                                                       ('Les Bienfaits du Yoga pour Débutants', 'Le yoga offre de nombreux avantages, notamment une meilleure souplesse, une réduction du stress et une augmentation de l’énergie. Ce cours vous enseigne comment intégrer le yoga dans votre quotidien, vous aidant à atteindre un équilibre entre le corps et l’esprit.', NULL, 4),

                                                        -- Cartes pour "Yoga Dynamique" (Course ID 5)
                                                       ('Enchaînements Dynamiques de Yoga', 'Le yoga dynamique est une forme plus active de yoga, qui se concentre sur des enchaînements fluides de postures. Ce cours vous permet de renforcer votre endurance et de développer votre flexibilité tout en améliorant la circulation sanguine et en réduisant le stress.', NULL, 5),
                                                       ('Renforcer votre Corps avec le Yoga Dynamique', 'Le yoga dynamique permet de tonifier le corps en combinant force et souplesse. Dans ce cours, vous apprendrez des techniques pour renforcer vos muscles tout en gardant une respiration contrôlée, contribuant ainsi à une meilleure santé physique et à un mental plus fort.', NULL, 5),

                                                        -- Cartes pour "Méditation et Yoga" (Course ID 6)
                                                       ('La Méditation pour la Paix Intérieure', 'La méditation est un outil puissant pour réduire le stress, améliorer la concentration et atteindre un état de calme mental. Ce cours vous apprendra à pratiquer la méditation en combinaison avec le yoga, vous permettant de développer une plus grande paix intérieure et d’améliorer votre bien-être général.', NULL, 6),
                                                       ('Yoga et Méditation pour la Santé Mentale', 'Ce cours combine les bienfaits du yoga et de la méditation pour créer une approche holistique du bien-être mental. Apprenez à calmer l’esprit, à réduire l’anxiété et à améliorer votre concentration en intégrant ces pratiques dans votre routine quotidienne.', NULL, 6),
                                                       -- Cartes pour "Gestion de Budget Personnel" (Course ID 7)
                                                       ('Introduction à la Gestion de Budget Personnel', 'La gestion de budget personnel est essentielle pour garantir une stabilité financière. Ce cours vous apprendra à suivre vos dépenses, à établir des priorités et à économiser de manière efficace pour atteindre vos objectifs financiers.', NULL, 7),
                                                       ('Les Meilleures Pratiques pour Gérer son Budget', 'Apprenez les meilleures stratégies pour gérer vos finances personnelles, notamment l’établissement d’un budget mensuel, le suivi des dépenses et l’épargne, afin de mieux gérer votre argent à court et long terme.', NULL, 7),

                                                        -- Cartes pour "Introduction à l’Investissement" (Course ID 8)
                                                       ('Les Bases de l’Investissement', 'L’investissement est un moyen puissant de faire fructifier votre argent. Ce cours vous introduit aux différents types d’investissements, vous aidant à comprendre les actions, les obligations et les placements immobiliers pour bâtir un portefeuille solide.', NULL, 8),
                                                       ('Investir en Bourse : Les Premiers Pas', 'Apprenez comment investir en bourse avec des conseils pratiques pour débutants, y compris l’analyse des actions, la gestion des risques et la diversification des investissements.', NULL, 8),

                                                        -- Cartes pour "Comprendre les Cryptomonnaies" (Course ID 9)
                                                       ('Introduction aux Cryptomonnaies', 'Les cryptomonnaies sont devenues un investissement populaire ces dernières années. Ce cours explore les bases des cryptomonnaies, comment elles fonctionnent et ce qu’il faut savoir avant de commencer à investir.', NULL, 9),
                                                       ('Les Risques et Opportunités des Cryptomonnaies', 'Découvrez les avantages et les risques liés à l’investissement dans les cryptomonnaies, ainsi que les stratégies pour naviguer dans ce marché volatile et prendre des décisions éclairées pour votre portefeuille.', NULL, 9),
                                                       -- Cartes pour "Introduction à la Programmation" (Course ID 10)
                                                       ('Introduction à la Programmation avec Python', 'La programmation est une compétence clé dans le monde numérique d’aujourd’hui. Ce cours vous apprend les bases de la programmation avec Python, un langage simple et puissant, vous permettant de créer des programmes et d’automatiser des tâches.', NULL, 10),
                                                       ('Les Fondamentaux de la Programmation', 'Apprenez à penser comme un programmeur avec ce cours qui couvre les concepts fondamentaux de la programmation, y compris les variables, les boucles et les conditions, en utilisant Python pour vous initier à la logique de programmation.', NULL, 10),

                                                        -- Cartes pour "Découverte de l’IA" (Course ID 11)
                                                       ('Introduction à l’Intelligence Artificielle', 'L’intelligence artificielle transforme de nombreux secteurs. Ce cours vous donne un aperçu des concepts de base de l’IA, y compris les algorithmes d’apprentissage automatique, le traitement du langage naturel et l’analyse de données.', NULL, 11),
                                                       ('Comprendre l’IA et ses Applications', 'Explorez comment l’intelligence artificielle est utilisée dans différents domaines, comme la santé, la finance et l’industrie, et apprenez comment les entreprises exploitent l’IA pour optimiser leurs processus et créer de nouvelles opportunités.', NULL, 11),

                                                        -- Cartes pour "Sécurité Informatique" (Course ID 12)
                                                       ('Les Bases de la Sécurité Informatique', 'La sécurité informatique est essentielle pour protéger vos données et vos systèmes. Ce cours vous initie aux concepts de base, comme la gestion des mots de passe, la sécurité des réseaux et la prévention des attaques.', NULL, 12),
                                                       ('Protéger vos Données en Ligne', 'La cybersécurité est plus importante que jamais. Apprenez à sécuriser vos appareils et vos informations personnelles en ligne avec des pratiques simples mais efficaces pour prévenir le vol d’identité et d’autres menaces.', NULL, 12),

                                                        -- Cartes pour "Techniques de Base en Cuisine" (Course ID 13)
                                                        ('Les Bases de la Cuisine pour Débutants', 'Ce cours vous introduit aux techniques de base en cuisine, des couteaux aux méthodes de cuisson essentielles, afin que vous puissiez préparer des repas simples mais délicieux. Vous apprendrez à maîtriser les gestes fondamentaux pour devenir un cuisinier plus confiant.', NULL, 13),
                                                        ('Maîtriser les Techniques de Cuisine', 'Apprenez les bases de la cuisine en abordant des techniques essentielles comme la découpe des légumes, la cuisson des viandes et la préparation des sauces. Ce cours est conçu pour les débutants qui souhaitent acquérir les compétences nécessaires pour cuisiner à la maison.', NULL, 13),

                                                        -- Cartes pour "Cuisine Italienne" (Course ID 14)
                                                        ('Les Secrets de la Cuisine Italienne', 'La cuisine italienne est riche en saveurs et en tradition. Ce cours vous apprendra à préparer des plats italiens classiques, des pâtes aux pizzas, en utilisant des ingrédients frais et de qualité pour apporter l’authenticité dans vos plats.', NULL, 14),
                                                        ('Cuisine Italienne : Recettes Incontournables', 'Découvrez des recettes italiennes incontournables comme les lasagnes, les raviolis et les tiramisus. Ce cours vous guide dans la préparation de plats savoureux qui raviront vos invités et vous feront voyager en Italie.', NULL, 14),

                                                        -- Cartes pour "Pâtisserie pour Débutants" (Course ID 15)
                                                        ('Introduction à la Pâtisserie', 'Ce cours vous enseigne les bases de la pâtisserie, des techniques de mélange à la cuisson des gâteaux. Vous apprendrez à préparer des desserts simples mais impressionnants, comme des biscuits, des cakes et des tartes.', NULL, 15),
                                                        ('Créer des Desserts Délicieux', 'Apprenez à maîtriser les techniques de pâtisserie, de la pâte à choux aux crèmes, pour créer des desserts dignes des meilleures pâtisseries. Ce cours est parfait pour les débutants qui souhaitent se lancer dans la création de sucreries maison.', NULL, 15),

                                                        -- Cartes pour "Course à Pied pour Débutants" (Course ID 16)
                                                        ('Démarrer la Course à Pied', 'Ce cours est conçu pour les débutants qui souhaitent se lancer dans la course à pied. Vous apprendrez à établir un plan d’entraînement progressif pour améliorer votre endurance et prévenir les blessures, tout en vous amusant à courir.', NULL, 16),
                                                        ('Les Meilleures Astuces pour les Débutants en Course à Pied', 'Découvrez des conseils essentiels pour débuter la course à pied, comme choisir les bonnes chaussures, ajuster votre posture et respirer correctement. Ce cours vous aidera à rester motivé et à atteindre vos objectifs de course.', NULL, 16),

                                                        -- Cartes pour "Musculation à la Maison" (Course ID 17)
                                                        ('Programmes de Musculation à la Maison', 'Ce cours vous apprend comment créer une routine de musculation efficace à la maison, en utilisant seulement le poids du corps ou des équipements simples. Vous apprendrez à cibler tous les groupes musculaires pour améliorer votre force et votre condition physique.', NULL, 17),
                                                        ('Exercices Simples pour Muscler tout le Corps', 'Apprenez des exercices simples mais efficaces pour muscler tout votre corps à la maison. Ce cours est parfait pour ceux qui souhaitent s’entraîner sans équipement sophistiqué tout en obtenant des résultats visibles.', NULL, 17),

                                                        -- Cartes pour "Yoga pour les Sportifs" (Course ID 18)
                                                        ('Améliorer la Souplesse avec le Yoga', 'Le yoga est un excellent moyen d’améliorer la souplesse et de réduire les risques de blessure pour les sportifs. Ce cours vous apprend des postures spécifiques pour étirer les muscles sollicités par vos entraînements et améliorer votre mobilité générale.', NULL, 18),
                                                        ('Yoga pour les Athlètes : Prévention des Blessures', 'Apprenez à intégrer le yoga dans votre routine sportive pour renforcer votre corps, prévenir les blessures et améliorer votre récupération. Ce cours est conçu pour les athlètes de tous niveaux qui cherchent à optimiser leur performance grâce au yoga.', NULL, 18),

                                                        -- Cartes pour "Mathématiques de Base" (Course ID 19)
                                                        ('Reprendre les Bases des Mathématiques', 'Ce cours est destiné aux débutants qui souhaitent revoir les bases des mathématiques, telles que les opérations de base (addition, soustraction, multiplication et division), la résolution d’équations simples et la compréhension des concepts de fractions et de décimaux.', NULL, 19),
                                                        ('Les Fondamentaux des Mathématiques', 'Apprenez les concepts fondamentaux des mathématiques, y compris l’arithmétique, la géométrie et les premiers pas dans l’algèbre. Ce cours est parfait pour ceux qui veulent solidifier leur compréhension des bases avant de passer à des sujets plus avancés.', NULL, 19),

                                                        -- Cartes pour "Introduction à l’Algèbre" (Course ID 20)
                                                        ('Les Concepts Clés de l’Algèbre', 'Ce cours introduit les bases de l’algèbre, y compris les équations, les expressions et les inégalités. Vous apprendrez à manipuler les variables et à résoudre des équations simples, vous préparant ainsi à des concepts plus avancés.', NULL, 20),
                                                        ('Maîtriser l’Algèbre', 'Apprenez à résoudre des équations linéaires, à travailler avec des polynômes et à comprendre les relations algébriques entre les variables. Ce cours est conçu pour les étudiants souhaitant comprendre et appliquer les principes de l’algèbre dans des contextes réels.', NULL, 20),

                                                        -- Cartes pour "Statistiques pour Débutants" (Course ID 21)
                                                        ('Introduction aux Statistiques', 'Ce cours est destiné aux débutants souhaitant comprendre les bases des statistiques. Vous apprendrez à collecter et organiser des données, à comprendre les mesures de tendance centrale (moyenne, médiane, mode) et à interpréter les résultats.', NULL, 21),
                                                        ('Les Bases des Statistiques et de l’Analyse de Données', 'Apprenez les concepts fondamentaux des statistiques, y compris les distributions de probabilité, les échantillons et les tests statistiques de base. Ce cours vous permettra d’analyser des données et de tirer des conclusions utiles pour des décisions éclairées.', NULL, 21),
                                                       -- Cartes pour "Les Bases de l’Astronomie" (Course ID 22)
                                                       ('Introduction à l’Astronomie', 'Ce cours vous introduit aux concepts fondamentaux de l’astronomie, des étoiles aux galaxies. Vous apprendrez les bases de l’observation astronomique, la structure de l’univers et les phénomènes célestes, afin de mieux comprendre notre place dans l’univers.', NULL, 22),
                                                       ('Les Fondamentaux de l’Astronomie', 'Apprenez les concepts clés de l’astronomie, y compris la formation des étoiles, l’évolution des galaxies et les lois fondamentales qui régissent l’univers. Ce cours est destiné à ceux qui souhaitent acquérir une compréhension générale de l’astronomie.', NULL, 22),

                                                        -- Cartes pour "Exploration du Système Solaire" (Course ID 23)
                                                       ('Découvrir le Système Solaire', 'Ce cours explore notre système solaire, des planètes aux lunes en passant par les astéroïdes et les comètes. Vous apprendrez les caractéristiques uniques de chaque planète et leur place dans l’univers, tout en découvrant des missions spatiales historiques.', NULL, 23),
                                                       ('Voyage à travers le Système Solaire', 'Parcourez le système solaire et explorez chaque planète, ses particularités et ses mystères. Ce cours vous guidera à travers les dernières découvertes scientifiques et les avancées technologiques dans l’exploration spatiale.', NULL, 23),

                                                        -- Cartes pour "Introduction à l’Astrophysique" (Course ID 24)
                                                       ('Les Principes de l’Astrophysique', 'Ce cours vous introduit à l’astrophysique, l’étude des lois physiques de l’univers. Vous apprendrez comment la gravité, l’énergie et la matière interagissent dans des phénomènes comme les trous noirs, les supernovae et les ondes gravitationnelles.', NULL, 24),
                                                       ('Comprendre l’Astrophysique', 'Explorez les phénomènes astrophysiques fascinants, comme la formation des trous noirs, la naissance des étoiles et l’expansion de l’univers. Ce cours vous donnera une base solide pour comprendre les forces qui régissent l’univers à grande échelle.', NULL, 24);


