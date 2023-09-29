INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Lampadati', 'Corsita', 1795000.00, 'O Corsita é movido por um motor V12...', '/img/car1.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Grotti', 'Turismo R', 500000.00, 'O Turismo R fica aquém de ser um dos Super Carros mais ...', '/img/car2.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Itali', 'GTO', 1965000.00, 'Possui boa velocidade máxima, boa dirigibilidade...', '/img/car3.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Ocelot', 'Pariah', 1420000.00, 'Em termos de desempenho, o Pária está em uma categoria à parte...', '/img/car4.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Annis', 'S80RR', 2575000.00, 'A aceleração do S80RR é surpreendentemente boa para um veículo...', '/img/car5.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Vigilante', "WarStock", 3750000.00, 'O Vigilante é um carro esportivo de bom desempenho que também combina capacidades ofensivas...', '/img/car6.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Canis', 'Kalahari', 40000.00, 'O Kalahari tem um desempenho muito bom, tendo uma boa velocidade...', '/img/car7.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Stinger', 'GT', 875000.00, 'O Stinger GT, sendo um grand tourer, é um carro de bom desempenho para sua classe...', '/img/car8.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Bravado', 'Banshee', 536750.00, 'De modo geral o Banshee é um dos carros mais ágeis, sua velocidade máxima a suas aceleração são exelentes...', '/img/car9.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Benefactor', 'Krieger', 2285000.00, 'O Krieger pode ser considerado um excelente supercarro versátil...', '/img/car10.png', 1, 2023, 2023, '2023-09-29');


INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Pfister', '811', 1135000.00, 'O 811 tem um desempenho fenomenal. Com corpo leve, tração nas quatro rodas...', '/img/car11.png', 1, 2023, 2023, '2023-09-29');

INSERT INTO car (brand, model, value, description, image, interest, manufactureyear, modelyear, registerdate)
VALUES
('Entity', 'XF', 795000.00, 'O carro é capaz de atingir velocidades muito altas, sua velocidade máxima é um pouco menor do que a do Adder...', '/img/car12.png', 1, 2023, 2023, '2023-09-29');




UPDATE car SET description = "O Corsita é movido por um motor V12 cujo modelo é derivado de carros como o Infernus Classic , o Torero e o Toros. É acoplado a uma caixa de câmbio de 8 marchas em motor central traseiro, layout de tração traseira, e usa o mesmo som de motor de carros como o Itali GTO e o Itali RSX , embora com tom mais agudo." WHERE brand = "Lampadati"
UPDATE car SET description = "
O Turismo R fica aquém de ser um dos Super Carros mais rápidos. A aceleração é excelente e há uma boa rotação das rodas. A velocidade máxima também é muito boa, sendo tão rápida quanto a do Zentorno. Como o carro contém um motor elétrico, não há perda de potência durante as mudanças de marcha.

" WHERE brand = "Grotti";

UPDATE car SET description = "
Possui boa velocidade máxima, boa dirigibilidade, mas baixa durabilidade, compartilhando os mesmos atributos do Itali GTB. O Itali GTO é movido por um motor em forma de V que aciona todas as rodas através de uma caixa de câmbio de 6 velocidades. O modelo do motor, emula o motor V12 da Ferrari 812.

" WHERE brand = "Itali";

UPDATE car SET description = "
Em termos de desempenho, o Pária está em uma categoria à parte. Ele se destaca na classe Sports, mais do que outros como Elegy RH8 , Neo e Jugular , e seria competitivo na classe Supers. Apesar de ser movido pelo que parece ser um motor 4 em linha de grande cilindrada, ele tem níveis de potência de supercarro, proporcionando velocidade máxima e aceleração incomumente altas.

" WHERE brand = "Ocelot";

UPDATE car SET description = "
A aceleração do S80RR é surpreendentemente boa para um veículo com tração traseira. A velocidade máxima é comparável à da maioria dos carros da superclasse. O manuseio é quase único em comparação com outros carros, com a capacidade de virar muito bruscamente e recuperar facilmente o controle se o carro começar a derrapar.

" WHERE brand = "Annis";

UPDATE car SET description = "
O Vigilante é um carro esportivo de bom desempenho que também combina capacidades ofensivas de veículos armados e pesados. Possui boa aceleração, boa tração e dirigibilidade decente, e sua massa, sendo semelhante à do Insurgent , permite-lhe atravessar o trânsito com facilidade, principalmente devido à sua dianteira.

" WHERE brand = "Vigilante";

UPDATE car SET description = "
O Kalahari tem um desempenho muito bom, tendo uma boa velocidade e aceleração máximas, mas também se sai bem fora da estrada. Embora este veículo tenha boa aceleração, sua velocidade máxima não é adequada quando se trata de competir contra outros veículos mais rápidos. Além disso, os perfis finos dos pneus tornam-no menos desejável para fins off-road.

" WHERE brand = "Canis";

UPDATE car SET description = "
O Stinger GT, sendo um grand tourer, é um carro de bom desempenho para sua classe. O modelo de motor do jogo mostra um motor V8 com eixo de comando único no cabeçote, com 4 carburadores de cano duplo de corrente descendente. Ao contrário do Stinger padrão, o Stinger GT tem seu motor montado na posição longitudinal central traseira, enquanto o Stinger tem o motor colocado na posição central dianteira.

" WHERE brand = "Stinger";

UPDATE car SET description = "
De modo geral o Banshee é um dos carros mais ágeis, sua velocidade máxima a suas aceleração são exelentes, mas devido ao seu corpo grande e seus eixos largos sua dirigibilidade é baixa, se o motorista são souber usar o freio de mão de forma correta em curvas fechadas o carro pode perder o controle e bater violentamente contra as paredes. Sua frenagem é ótima, são necessários poucos metros de estrada para o Banshee parar totalmente

" WHERE brand = "Bravado";

UPDATE car SET description = "
O Krieger pode ser considerado um excelente supercarro versátil. Não só possui boa velocidade máxima e dirigibilidade, mas também possui excelente aceleração e tração, permitindo mover-se rapidamente após desacelerar. O layout de tração integral também oferece boas capacidades em estradas e ambientes off-road, mas os obstáculos podem ser um problema para sua estabilidade.

" WHERE brand = "Benefactor";

UPDATE car SET description = "
O 811 tem um desempenho fenomenal. Com corpo leve, tração nas quatro rodas e ótima aerodinâmica, o carro tem aceleração extrema, superando todas as motocicletas e supercarros não elétricos. Segundo os arquivos, a velocidade máxima do veículo é semelhante ao do T20, sendo o terceiro carro mais rápido. O layout do motor traseiro do carro parece benéfico em termos de relação potência/peso.

" WHERE brand = "Pfister";

UPDATE car SET description = "
O carro é capaz de atingir velocidades muito altas, sua velocidade máxima é um pouco menor do que a do Adder. Mas por outro lado ele tem uma aceleração melhor do que todos os outros supercarros. Ele também tem uma tração muito alta devido ao seu sistema de tração integral e excelente distribuição de peso. De 0 a 100 KM/h em 3,5 segundos, câmbio de 6 marchas; Motor V8;

" WHERE brand = "Entity";

