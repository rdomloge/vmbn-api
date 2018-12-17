INSERT INTO Business (id, name, asking_price, turnover, net_profit) VALUES (1, 'Creams Cafe With Excellent Potential In South London For Sale', '295000', '250000', 0)
UPDATE Business SET location='South London, London' WHERE id=1
INSERT INTO Business_Description (business_id, description) VALUES (1, 'Established in 2017 this Creams store in South London offers a trendy, attractive ambience with stylish Americana retro 50’s design. The store boasts a fantastic menu including Italian gelato, sundaes, freshly made American style waffles, crepes and desserts. Beverages include fair trade coffee, juices, smoothies and milkshakes.')
INSERT INTO Business_Description (business_id, description) VALUES (1, 'This cafe is situated in a popular part of London, opposite some popular retail outlets, and in easy reach of other high street stores and cafes. With a high pedestrian footfall around the area, this business attracts regular repeat business as well as new passing trade.')
INSERT INTO Business_Description (business_id, description) VALUES (1, 'Whilst only established for a short period of time the current franchisee has seen sales in 2018 increase to around £300,000. This business is looking for someone with enthusiasm, and a proven track record of growing franchised businesses to seize this excellent opportunity to build on the current franchisees’ efforts.')
INSERT INTO Business_Description (business_id, description) VALUES (1, 'By continuing to develop and grow the excellent reputation of the brand and customer base already instilled by the existing owner, it would be easy to see how a further increase in sales can be achieved by working alongside an already dedicated team of people.')
INSERT INTO Business_Description (business_id, description) VALUES (1, 'Do you have the flair and ambition needed to be a Creams franchisee?')
INSERT INTO Business_Description (business_id, description) VALUES (1, 'Who is the franchisor')
INSERT INTO Business_Description (business_id, description) VALUES (1, 'Creams Cafe started back in 2008 and the first UK franchise took 2 years of meticulous research and planning until it was finally set up. After several trips to Italy, the authentic gelato ice cream was carefully selected to bring customers the very best quality of ice cream desserts.')
INSERT INTO Business_Description (business_id, description) VALUES (1, 'This franchise is a unique and independent food brand and Creams stores aim to hold an aesthetically pleasing value. The aim is to present a 1950’s retro Americana genre whilst boasting a black and purple colour scheme alongside with distinctive lighting which adds a trendy, unique looking design and feel. A wide range of sundaes, smoothies, juices, and desserts have been created that contain recipes giving indulging flavours that can only be experienced at Creams. Creams Cafes are a place to visit during any time of the day and is suitable for all age groups.')

INSERT INTO Property_Information (id, property_type, location_description) VALUES (1, 'Leasehold', 'Situated on a popular high street in London with excellent footfall')
UPDATE Business SET fk_property_information = 1 WHERE id=1

INSERT INTO Business_Operation (id, employees_description, years_established) VALUES (1, 'Further details regarding employees will be given once a Non-Disclosure Agreement is signed', 'Established in 2017')
UPDATE Business SET fk_business_operation = 1 WHERE id = 1

INSERT INTO Franchise_Information (id, franchise_opportunity) VALUES (1, 'FranchiseResale')
UPDATE Business SET fk_franchise_information = 1 WHERE id = 1

INSERT INTO Other_Information (id, support_and_training, financing_available, website) VALUES (1, 'All support and training will be provided by the franchisor.', 'Franchise Resales has a fantastic relationship with all the major UK banks, so we can point you in the right direction when it comes to borrowing.', 'www.catholicon.cliub')
UPDATE Business SET fk_other_information = 1 WHERE id = 1

INSERT INTO Image (id, description, business_id, thumbnail_path, full_image_path) VALUES (1, 'Sundae', 1, '14a7f0ff-744a-478c-8119-1e3f97f8ccea_thumb.jpg', '14a7f0ff-744a-478c-8119-1e3f97f8ccea.jpg')
INSERT INTO Image (id, description, business_id, thumbnail_path, full_image_path) VALUES (2, 'Waffle', 1, '8620b336-a880-4141-bd7f-a58625e6067d_thumb.jpg', '8620b336-a880-4141-bd7f-a58625e6067d.jpg')
INSERT INTO Image (id, description, business_id, thumbnail_path, full_image_path) VALUES (3, 'Logo', 1, 'e5f9ca5a-0b5a-4eb0-b946-7b72145a5ab3_thumb.jpg', 'e5f9ca5a-0b5a-4eb0-b946-7b72145a5ab3.jpg')
INSERT INTO Image (id, description, business_id, thumbnail_path, full_image_path) VALUES (4, 'Sundae2', 1, 'e428cd9a-5164-48e9-9d37-0551f78f36cb_thumb.jpg', 'e428cd9a-5164-48e9-9d37-0551f78f36cb.jpg')