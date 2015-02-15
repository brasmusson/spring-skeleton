Feature:

  Scenario:
    Given I prepare a "only images and pricing" item for the "furniture" dealer
    When I perform the "createItem" inventory service call
    Then I should get the "200" response code
    And the inventory service response result should be a "Vertical Item" object
